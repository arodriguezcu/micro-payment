FROM openjdk:8-alpine
COPY "./target/micro-payment-0.0.1-SNAPSHOT.jar" "appmicro-payment.jar"
EXPOSE 8098
ENTRYPOINT ["java","-jar","appmicro-payment.jar"]