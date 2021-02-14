FROM adoptopenjdk/openjdk9
ENV JAVA_OPTS="-Djava.net.preferIPv4Stack=true -Djava.net.preferIPv4Addresses=true"

ADD core-thorntail.jar /opt/core-thorntail.jar
ADD core.war /opt/core.war

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/core-thorntail.jar"]
