Integrar sonarqube:

# Instalar Sonarqube

Antes de nada, cambiar 4 parametros del kernel de linux: COMO SUPERUSUSARIO
sysctl -w vm.max_map_count=524288
sysctl -w fs.file-max=131072
ulimit -n 131072
ulimit -u 8192
*Ver: https://hub.docker.com/_/sonarqube

docker run -d --name sonarqube -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:latest
Ojo: Instalación de juguete.. más info para una instalación real:
https://docs.sonarqube.org/latest/setup/install-server/

docker run -d --name sonarqube \
    -p 9000:9000 \
    -e SONAR_JDBC_URL=... \
    -e SONAR_JDBC_USERNAME=... \
    -e SONAR_JDBC_PASSWORD=... \
    -v sonarqube_data:/opt/sonarqube/data \
    -v sonarqube_extensions:/opt/sonarqube/extensions \
    -v sonarqube_logs:/opt/sonarqube/logs \
    sonarqube:latest

# Generar un token en SonarQube

92042470d070a6478ad7341a002981e2c9bf0666

# Integración:

Jenkins -> Sonarqube
Maven   ->

mvn sonar:sonar \
    -Dsonar.projectKey=proyectoMaven \
    -Dsonar.host.url=http://34.254.60.234:9000/ \
    -Dsonar.login=92042470d070a6478ad7341a002981e2c9bf0666

