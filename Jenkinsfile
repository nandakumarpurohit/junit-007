pipeline {
    tools {
        maven 'maven3'
        env.JAVA_HOME="/opt/jdk1.8.0_171"
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