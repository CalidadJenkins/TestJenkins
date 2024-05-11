pipeline {
    agent any

    stages {
        stage('Clean Maven Repository') {
            steps {
                bat 'mvn dependency:purge-local-repository'
            }
        }
        stage('Build') {
            steps {
                bat './mvnw clean package'
            }
        }
        stage('Test') {
            steps {
                bat './mvnw test'
            }
        }
    }
}
