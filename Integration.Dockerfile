FROM hseeberger/scala-sbt:8u212_1.2.8_2.12.8

RUN mkdir -p /root/build

WORKDIR /root/build

COPY ./ /root/build

CMD sbt test
