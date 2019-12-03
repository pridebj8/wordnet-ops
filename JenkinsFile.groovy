pipeline {
    environment {
        registry = "mamohr/centos-java"
        registryCredential = 'docker'
    }
    agent none
    stages {
        stage('Build') {
            agent any
            steps {
                echo "Build~"
                sh 'chmod +x ./gradlew'
                sh('./gradlew build')
            }
        }
        stage('Build docker ps') {
            agent any
            steps {
                sh 'docker build -t wordnet01 .'
                sh 'docker run -p 49000:49000 -d wordnet01'
            }
        }
    }
    //마지막 어떻게 할껀지
    post {
        always {
            echo 'build done!!!!!'
        }
        failure {
            echo 'build Fail!!!!!'
            //mail to: team@gmail.com, subject: 'Pipeline fail email'
        }
    }
}