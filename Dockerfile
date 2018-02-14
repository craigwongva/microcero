FROM centos
MAINTAINER craig@dummyemail.com
RUN yum install maven -y
RUN yum install java-1.7.0-openjdk-devel -y
RUN export JAVA_HOME=/usr/lib/jvm/java
RUN yum install wget -y
RUN yum install unzip -y
RUN wget https://github.com/grails/grails-core/releases/download/v2.4.0/grails-2.4.0.zip
RUN unzip grails-2.4.0 -d /usr/local/share
ENV JAVA_HOME /usr/lib/jvm/java
RUN /usr/local/share/grails-2.4.0/bin/grails -version
CMD ["sleep", "600"]
