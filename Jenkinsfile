pipeline {
    agent any
    
    triggers {
        pollSCM '* * * * *'
    }

    tools {
    maven 'maven-3'
    jdk 'jdk8'
    }

    stages {

        stage('Init') {
                    steps {
                        sh '''
                            echo "PATH = ${PATH}"
                            echo "M2_HOME = ${M2_HOME}"
                           '''
                   }
                }

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
