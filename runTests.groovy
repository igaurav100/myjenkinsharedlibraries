def call(Map config) {
    stage('Test') {
        if (config.runTests) {
            sh 'mvn test'
            junit 'target/surefire-reports/*.xml'
        } else {
            echo 'Skipping tests as per parameter configuration.'
        }
    }
}