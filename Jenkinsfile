pipeline {
    tools {
        maven 'maven3'
        jdk 'java8'
    }
    agent any 
    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean package' 
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
        }
        stage('Deploy') { 
            steps {
                sh 'mvn install' 
            }
        }
    }
}