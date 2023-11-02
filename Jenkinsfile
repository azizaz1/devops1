pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from version control (Git)
                git branch: 'main', url: 'https://github.com/azizaz1/devops1.git'
            }
        }

        stage('Build') {
            steps {
                // Build the project using Maven or Gradle
                sh 'mvn clean package' // For Maven
                // Or: sh './gradlew build' // For Gradle
            }
        }

        stage('Test') {
            steps {
                // Run JUnit tests using Maven or Gradle
                sh 'mvn test' // For Maven
                // Or: sh './gradlew test' // For Gradle
            }
        }

        stage('Deploy') {
            steps {
               junit '**/target/surefire-reports/TEST-*.xml'
            }
        }
    }
}
