pipeline {
    agent any

    stages {
         stage('Checkout') {
            steps {
                // Checkout code from version control (Git)
                git branch: 'main', url: 'https://github.com/azizaz1/devops1.git'
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
