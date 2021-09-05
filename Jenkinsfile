pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    triggers {
        pollSCM '* * * * *'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
           }
        }

        stage('Test') {
            steps {
                echo 'Test'
            }
        }
    }

}