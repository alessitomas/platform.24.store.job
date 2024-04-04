pipeline {
    agent any
    stages {
        stage('Jenkins Job') {
            steps {
                echo 'Jenkins Job'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}