pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/azizaz1/devops1.git'
                sh './mvnw clean compile'
                 bat '.\\mvnw clean compile'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
                 bat '.\\mvnw test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
