#!/usr/bin/env groovy

pipeline {

    agent any
    
    tools {
        jdk 'jdk17'
        maven 'M3.6'
    }

    triggers { pollSCM('*/5 * * * *') }

    options {
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    stages {
    
    	stage('Build Stage') { 
    		steps {
	      		sh "mvn clean install"
	    	}
	 	}

        stage('Mirroring') {
                when { branch "master" }
                steps {
                    script {
                        sh 'git config --global core.sshCommand "ssh -o UserKnownHostsFile=/dev/null -o StrictHostKeyChecking=no"'
                        if (fileExists('grizzly-api-common.git')) {
                            echo 'file exist'
                            sh 'rm -r grizzly-api-common.git' 
                        }
                        withCredentials([usernamePassword(credentialsId: 'bitbucket-jenkins-user', usernameVariable: 'GIT_USERNAME', passwordVariable: 'GIT_PASSWORD')]) {
                            sh "git clone --mirror https://${GIT_USERNAME}:${GIT_PASSWORD}@bitbucket.org/codeonceteam/grizzly-api-common.git"
                        }

                        sshagent(credentials: ['github-jenkins-user']) {
                            sh 'cd grizzly-api-common.git'
                            sh 'rm -r .git'
                            sh 'git init'
                            if (fileExists('grizzly-api-common.git')) {
                                sh 'rm -r grizzly-api-common.git'
                            }
                            sh 'git add .'
                            sh 'git commit -m "mirroring sync"'
                            sh 'git push -f git@github.com:codeoncesoftware/grizzly-api-common.git master'
                        }
                    }
            }
        }
    }
    
    post {
        always {
            junit testResults:'**/surefire-reports/*.xml', allowEmptyResults: true
        }
        
        failure {
             emailext (
		      subject: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
		      body: """<p>FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
		        <p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
		      recipientProviders: [[$class: 'DevelopersRecipientProvider'],[$class: 'CulpritsRecipientProvider']]
		    )
        }
    }

}