def call() {
    // Clone the repository
    git branch: 'main', url: 'https://github.com/Sanchit2323/Redis-ansible.git'

    // User Approval
    input message: 'Approve the deployment?', submitter: 'admin,sanchit'

    // Playbook Execution
    ansiblePlaybook(
        inventory: 'aws_ec2.yml',
        playbook: 'replicated.yml'
    )

    // Notification
    emailext(
        subject: 'Ansible Deployment Status',
        body: 'The Ansible deployment has completed.',
        to: 'sanchitkumar0307@gmail.com'
    )
}
