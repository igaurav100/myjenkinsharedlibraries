def call(Map config) {
    stage('Notify') {
        def status = config.buildStatus ? 'SUCCESS' : 'FAILURE'
        // Example: Send notification (e.g., Slack or email)
        echo "Sending notification for ${status} on branch ${config.branch}"
    }
}