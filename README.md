~/.sdkman/candidates/grails/2.4.0/bin/grails war
sudo cp target/microcero-0.1.war /usr/share/tomcat7/webapps/microcero.war

scripts/_Events.groovy 

    places the sha into META/MANIFEST.MF

conf/BootStrap.groovy 

    uses the sha, i.e. println sha, which appears in the Tomcat log
