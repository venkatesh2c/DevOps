This are the Jenkins tasks:

1. Create jenkins pipeline job to find master/slave server details.
2. Create a jenkins job to take the backup of Jenkins Server
3. Create a jenkins pipeline job with multiple stages with different slave on each stage
	a) First 5 stages should run on NODE1 and next 5 stages should run on NODE2
4. Write a pipeline script to accept user input and validate. 
5. Verify/enable DEBUG option on each stage of pipeline job
6. Write a pipeline script to execute exception error or error handling . 
7. Write a pipeline script to skip stage1 error and execute stage2 
8. Write a piepline script to add 'Docker' as a node/slave.
9. Write a pipeline script to call variables from other job to your current job. 
10. Write a pipeline script to use 'artifacts' from other job to your current job. 
11. Write a pipeline script to execute on agent (NODE1) and make sure failure case of NODE1 . 
	Ex: if NODE1 fails/offline , script should run on NODE2
12. Run your pipeline on multiple agents (NODE1 and NODE2 ...)
