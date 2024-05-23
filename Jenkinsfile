pipeline {
    agent any
    
    environment {
        AWS_ACCESS_KEY_ID     = credentials('accesskey')
        AWS_SECRET_ACCESS_KEY = credentials('secretkey')
    }
    
    stages {
        stage('Installing Redis') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'install.yml',
                        inventory: 'aws_ec2.yml',
                        credentialsId: 'Sanchit32.pem'
                    )
                }
            }
        }
    }
}
