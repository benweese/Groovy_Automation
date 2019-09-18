FROM alpine:latest
LABEL maintainer="ben@benweese.dev"

RUN apk --no-cache add \
    curl \
    git \
    vim \
    chromium \
    chromium-chromedriver \
    openjdk11

#install Gradle
RUN wget -q https://services.gradle.org/distributions/gradle-5.6.1-bin.zip \
    && unzip gradle-5.6.1-bin.zip -d /opt \
    && rm gradle-5.6.1-bin.zip

# Set Gradle in the environment variables
ENV GRADLE_HOME /opt/gradle-5.6.1
ENV PATH $PATH:$GRADLE_HOME/bin
