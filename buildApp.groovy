def call(Map config) {
    stage('Build') {
        sh "mvn clean package -DskipTests=${config.skipTests}"
        archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: true
    }
}