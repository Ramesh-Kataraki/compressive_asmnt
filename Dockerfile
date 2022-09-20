FROM openjdk:11
EXPOSE 8036
ADD target/Doctors_infoo-0.0.1-SNAPSHOT.jar Doctors_infoo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Doctors_infoo-0.0.1-SNAPSHOT.jar"]