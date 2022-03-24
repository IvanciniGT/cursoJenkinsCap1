FROM cloudbees/jenkins-enterprise:latest

USER root
ARG DOCKER_GID=999
RUN groupadd -g ${DOCKER_GID} docker
RUN usermod -aG docker jenkins
