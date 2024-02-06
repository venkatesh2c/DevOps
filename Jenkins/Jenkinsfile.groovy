pipeline {
    agent any
    stages{
        stage('Stage-1'){
            steps{
                sh 'echo This is Stage-1'
                }
        }
        stage('Stage-2'){
            steps{
                sh '''
                echo "This is Stage-2"
                '''
            }
        }
        stage('Stage-3'){
            steps{
                sh '''
                bash ${WORKSPACE}/Linux/script.sh
                '''
            }
        }
    }
 }
