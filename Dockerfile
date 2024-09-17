# Note: This image is also built in CircleCI, so limit references to internal repositories.
FROM maven:3.6.3-jdk-8
# If on Apple Silicon and running into build issues, Use arm64v8/maven:3.6.3-jdk-11
# For context: https://jira.plaid.com/browse/DEVBUILD-106

# Create app directory
WORKDIR /usr/src/app

# Copy app to directory
COPY . /usr/src/app

CMD ["mvn", "-Dmaven.javadoc.skip=true", "verify", "-e"]
