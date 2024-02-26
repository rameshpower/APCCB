pipeline {
    agent any
    
    tools {
        jdk 'JAVA8'
        ant 'ant1.10.13'
    }
    
    stages {
        stage('Build') {
            steps {
                sh 'ant clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'ant run-tests'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                script {
                    withSonarQubeEnv('LocalSonarqube') {
                        sh 'ant sonar'
                    }
                }
            }
        }
    }
}
