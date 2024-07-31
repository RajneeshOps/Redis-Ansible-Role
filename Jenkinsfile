@Library('my-shared-library@master') _

pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Lint Ansible') {
            steps {
                script {
                    org.yourorg.ansibleLint()
                }
            }
        }
        stage('Test Role') {
            steps {
                script {
                    org.yourorg.ansibleTest()
                }
            }
        }
        stage('Deploy Role') {
            steps {
                script {
                    org.yourorg.ansibleDeploy()
                }
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}
