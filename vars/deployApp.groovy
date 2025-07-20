def call(Map config) {
    stage("Deploy to ${config.environment}") {
        echo "Deploying to ${config.environment}..."
        // Example: Deploy using Docker
        sh "docker build -t myapp:${config.version} ."
        sh "docker push myapp:${config.version}"
        // Simulate deployment (e.g., to Kubernetes or AWS)
        echo "Deployed to ${config.environment} with version ${config.version}"
    }
}