
FROM openjdk:11
WORKDIR /usr/src/app
COPY . .
RUN javac Odd.java
CMD ["java", "Odd"]