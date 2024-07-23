def call() {
    // Clone the repository
    git branch: 'main', url: 'https://github.com/RajneeshOps/Redis-Ansible-Role.git'

    // User Approval
    input message: 'Approve the deployment?', submitter: 'admin,rajneesh'

    // Playbook Execution
    ansiblePlaybook(
        inventory: 'aws_ec2.yml',
        playbook: 'install.yml'
    )

   
}
