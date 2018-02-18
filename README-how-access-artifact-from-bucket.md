Create a new EC2 instance.
git clone /microcero
Run install-tomcat
Download CodePipeline's bucket content:
 aws s3 cp s3://wordpress-stack-artifactstorebucket-b72k8hm7wordpress-pipeline/BagArtifac/XoRPmkC .
Unzip its content: you will see Poder.war
Upload into tomcat as Poder.war
 sudo cp Poder-0.1.war /usr/share/tomcat7/webapps/Poder.war
Open security groups
Browse to :8080/microcero/Poder

In /microcero, create a CF template
 Create an EC2 instance, with userdata
 Incoming params should be
  BucketName
  ObjectKey
 For now in userdata just print these two params out to stdout or /tmp
In /microcero, create a CF template parameters file
{
  "BucketName" : { "Fn::GetArtifactAtt" : ["LambdaFunctionSource", "BucketName"]},
  "ObjectKey" : { "Fn::GetArtifactAtt" : ["LambdaFunctionSource", "ObjectKey"]}
}
use the new Fn::GetParam function to retrieve a value 
from a JSON-formatted file that is included in an artifact. 
within the paramete overrides.
