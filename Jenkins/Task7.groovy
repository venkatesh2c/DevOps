pipeline {
    agent any

    stages {
        stage('Stage 1') {
            steps {
                script {
                    try {
                        // Stage 1 steps that might throw exceptions
                        echo 'Executing Stage 1...'
                        // Example: Simulate an error by dividing by zero
                        def result = 10 / 0
                    } catch (Exception e) {
                        // Handle the exception
                        echo "Error occurred in Stage 1: ${e.getMessage()}"
                        // Skip this stage by returning
                        return
                    }
                }
            }
        }
        stage('Stage 2') {
            steps {
                script {
                    // Stage 2 steps
                    echo 'Executing Stage 2...'
                }
            }
        }
        // Add more stages as needed
    }

    post {
        always {
            // Clean-up actions that should be performed regardless of success or failure
            echo 'Performing clean-up actions...'
        }
        success {
            // Actions to be performed only if the pipeline succeeds
            echo 'Pipeline succeeded!'
        }
        failure {
            // Actions to be performed only if the pipeline fails
            echo 'Pipeline failed!'
        }
    }
}
