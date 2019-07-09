FROM openjdk:8
ADD target/ClaimServiceAPI-0.0.1-SNAPSHOT.jar ClaimServiceAPI-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ClaimServiceAPI-0.0.1-SNAPSHOT.jar"]