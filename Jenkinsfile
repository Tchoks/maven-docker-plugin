pipeline {
    agent any
    
    triggers {
        pollSCM '* * * * *'
    }

    stages {
        stage('Build') {
            steps {
                def mvnHome = tool name: 'maven-3', type: 'maven'
                def mvnCMD = "${mvnHome}/bin/mvn"
                sh "${mvnCMD} clean install"
           }
        }

        stage('Test') {
            steps {
                echo 'Test'
            }
        }
    }

}
