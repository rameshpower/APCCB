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
        stage('SonarQube Analysis') {
            steps {
                script {
                    withSonarQubeEnv('LocalSonarqube') {
                        sh 'ant sonar'
                    }
                }
            }
        }
        stage("Quality Gate") {
            steps {
                timeout(time: 10, unit: 'SECONDS') {
                    script {
                        def qg = waitForQualityGate()
                        def metrics = getCurrentQualityGateMetrics()
                        if (qg.status != 'OK' || metrics['coverage'] < 90) {
                            error "Pipeline aborted due to quality gate failure or code coverage less than 90%: ${qg.status}"
                        }
                    }
                }
            }
        }
    }
}
