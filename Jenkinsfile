pipeline {
    tools {
        maven 'maven3'
        jdk 'java8'
    }
    agent any 
    stages {
        stage('Clean') { 
            steps {
                sh 'mvn clean'
                echo 'CLEAN is DONE!' 
            }
        }
        stage('Package') { 
            steps {
                sh 'mvn package'
                echo 'PACKAGING is DONE!' 
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
