er@ip-172-31-28-217 microcero]$ sudo python ./awslogs-agent-setup-v1.0.py --region us-east-1                                                 
Launching interactive setup of CloudWatch Logs agent ... 

Step 1 of 5: Installing pip ...DONE

Step 2 of 5: Downloading the latest CloudWatch Logs agent bits ... DONE

Step 3 of 5: Configuring AWS CLI ... 
AWS Access Key ID [None]: REDACTED
AWS Secret Access Key [None]: REDACTED
Default region name [None]: us-west-2
Default output format [None]: text

Step 4 of 5: Configuring the CloudWatch Logs Agent ... 
Path of log file to upload [/var/log/messages]: /usr/share/tomcat7/logs/catalina.out
Destination Log Group name [/usr/share/tomcat7/logs/catalina.out]: microcero-catalina  

Choose Log Stream name:
  1. Use EC2 instance id.
  2. Use hostname.
  3. Custom.
Enter choice [1]: 1

Choose Log Event timestamp format:
  1. %b %d %H:%M:%S    (Dec 31 23:59:59)
  2. %d/%b/%Y:%H:%M:%S (10/Oct/2000:13:55:36)
  3. %Y-%m-%d %H:%M:%S (2008-09-08 11:52:54)
  4. Custom
Enter choice [1]: 3

Choose initial position of upload:
  1. From start of file.
  2. From end of file.
Enter choice [1]: 
More log files to configure? [Y]: n

Step 5 of 5: Setting up agent as a daemon ...DONE


------------------------------------------------------
- Configuration file successfully saved at: /var/awslogs/etc/awslogs.conf
- You can begin accessing new log events after a few moments at https://console.aws.amazon.com/cloudwatch/home?region=us-east-1#logs:
- You can use 'sudo service awslogs start|stop|status|restart' to control the daemon.
- To see diagnostic information for the CloudWatch Logs Agent, see /var/log/awslogs.log
- You can rerun interactive setup using 'sudo ./awslogs-agent-setup.py --region us-east-1 --only-generate-config'
------------------------------------------------------
[ec2-user@ip-172-31-28-217 microcero]$ 