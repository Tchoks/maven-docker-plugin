pipeline {
    agent any
    
    triggers {
        pollSCM '* * * * *'
    }

    tools {
    maven 'Maven 3.8.2'
    jdk 'jdk11'
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
