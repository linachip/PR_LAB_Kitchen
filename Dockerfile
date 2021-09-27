FROM openjdk:8
EXPOSE 8080
ADD target/kitchen-server-demo.jar kitchen-server-demo.jar
ENTRYPOINT ["java", "-jar", "/kitchen-server-demo.jar.jar"]
