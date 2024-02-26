pipeline {
  agent any
  tools {
    ant  'ant1.10.13'
    jdk 'JAVA8'
  }
  stages {
    stage ('Build') {
      steps {
        echo 'Notify GitLab of build started'
        updateGitlabCommitStatus name: 'build', state: 'pending'
        sh 'ant build'
        updateGitlabCommitStatus name: 'build', state: 'success'
      }
    }
    stage ('Deploy') {
      steps {
        script {
          echo 'Notify GitLab'
          updateGitlabCommitStatus name: 'deploy', state: 'pending'
          deploy adapters: [tomcat9(credentialsId: '2340dc63-aef3-4e92-9f71-91984d2bad51', path: '/managers/text', url: 'http://10.50.49.223:8080')], contextPath: '/APCCB', onFailure: false, war: '**/*.war' 
          updateGitlabCommitStatus name: 'deploy', state: 'success'
        }
      }
    }
  }
}
