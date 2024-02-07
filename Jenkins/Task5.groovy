pipeline {
    agent any

    stages {
        stage('Stage 1') {
            steps {
                script {
                    echo 'DEBUG: Entering Stage 1'
                    // Your stage 1 steps here
                }
            }
        }
        stage('Stage 2') {
            steps {
                script {
                    echo 'DEBUG: Entering Stage 2'
                    // Your stage 2 steps here
                }
            }
        }
        // Add more stages as needed
    }
}
