@Library('your-shared-library') _

pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout the Git repository
                git url: 'https://github.com/RajneeshOps/Redis-Ansible-Role.git', branch: 'main'
            }
        }
        stage('Deploy Redis Role') {
            steps {
                script {
                    org.p9.deploy()
                }
            }
        }
    }
}
