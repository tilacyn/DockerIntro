FROM gradle:4.6.0-jdk10

EXPOSE 4567

WORKDIR /usr/bin/app
ADD . .
RUN gradle build
CMD ["gradle", "run"]
