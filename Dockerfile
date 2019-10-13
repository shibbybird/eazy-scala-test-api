FROM openjdk:8u222-jre

RUN useradd -ms /bin/bash eazyci

USER eazyci

WORKDIR /home/eazyci

COPY target/scala-2.12/eazy-scala-test-api.jar /home/eazyci

CMD java -jar eazy-scala-test-api.jar
