package org.p9

def call() {
    sh 'ansible-playbook -i aws_ec2.yml --private-key=/Users/rajneeshyadav/Downloads/sprint4.pem install.yml'
}
