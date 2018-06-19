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
                echo 'Build is DONE!' 
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test'
                echo 'Test OK!' 
            }
        }
        stage('Deploy') { 
            steps {
                sh 'mvn install' 
                echo 'Installed! :)'
            }
        }
    }
}