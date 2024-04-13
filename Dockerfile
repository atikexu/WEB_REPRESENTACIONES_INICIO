FROM openjdk:11
COPY target/*.jar representacionesdelsur-1.0.0-SNAPSHOT.jar
#EXPOSE 8092
ENTRYPOINT ["java","-jar","/representacionesdelsur-1.0.0-SNAPSHOT.jar"]