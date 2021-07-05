pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Laxman-77/java-rest-api-calculator-1.git'
                sh './mvnw clean compile'
            }
        }

        stage('Test'){
            steps{
                sh './mvnw test'
            }

            post{
                always{
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }

        stage('Publish'){
            steps{
                sh './mvnw publish'
            }
            post{
                success{
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
