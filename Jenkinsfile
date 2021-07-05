pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Laxman-77/java-rest-api-calculator-1.git'
                sh './mvnw clean compile'
            }
        }
    }
}
