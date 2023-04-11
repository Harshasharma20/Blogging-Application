pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build App'
            }
        }
        stage('Test') {
            steps {
                echo 'Test App'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy App'
            }
        }
    }
    post{
        always{
          emailext body: 'It will send notification on email.', subject: 'Pipeline-Status', to: 'harshasharma1968@gmail.com'  
        }
    }
}
