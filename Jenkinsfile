pipeline {
    agent any
    
    tools {
        jdk 'JAVA8'
        ant 'ant1.10.13'
    }
    
    stages {
        stage('Build') {
            steps {
                dir("${WORKSPACE}/ant_project") {
                    sh 'ant clean compile'
                }
            }
        }

        stage('Run Tests') {
            steps {
                dir("${WORKSPACE}/ant_project") {
                    sh 'ant test'
                }
            }
        }

        stage('SonarQube Analysis') {
            steps {
                dir("${WORKSPACE}/ant_project") {
                    script {
                        withSonarQubeEnv('LocalSonarqube') {
                            sh 'ant sonar'
                        }
                    }
                }
            }
        }
    }
}
