FROM mamohr/centos-java
ADD ./build/libs/wordnet-ops-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]