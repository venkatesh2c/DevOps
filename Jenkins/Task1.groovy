pipeline{
	agent any
	stages{
		stage('stage1'){
			steps{
				sh 'echo this is stage1'
			}
		}
    stage('stage3'){
      steps{
        sh '''
            bash ${WORKSPACE}/Linux/task1.sh
        '''
    	}
		}
	}
}
