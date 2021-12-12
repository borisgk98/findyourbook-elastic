FROM gradle:7.3.1-jdk17 as builder

COPY --chown=gradle:gradle . /home/gradle/builddir
WORKDIR /home/gradle/builddir
WORKDIR src/main/resources
#RUN rm application.properties
#RUN cp deploy.properties application.properties
WORKDIR ../../..
RUN gradle bootJar

FROM openjdk:17
EXPOSE 8080
EXPOSE 6565
COPY --from=builder /home/gradle/builddir/build/libs/findyourbook-elastic-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app
CMD ["java", "-jar", "findyourbook-elastic-0.0.1-SNAPSHOT.jar"]