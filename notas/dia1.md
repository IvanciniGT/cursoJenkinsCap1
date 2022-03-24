# Jenkins

Servidor de automatización.

Herramienta de CI/CD.

Jenkins se basa en el empleo de PLUGINS. Hay miles de plugins.
    Plugin - git
    Plugin - maven
    Plugin - ansible

Cloudbees Jenkins (algunos plugins más y soporte)

# ALM

Application lifecycle managment

# DEVOPS

Cultura / Filosofía que adoptamos en algunas -todas- organizaciones, que invita a qué?
AUTOMATIZAR qué? TODO lo que hay entre DEV -> OPS

## CI/CD

### CI: Integración Continua

Automatizar la instalación y pruebas de una app de software en el entorno de integración.
Continuamente quiero la última versión que ha hecho desarrollo de una app en el entorno de 
integración sometida a pruebas automatizadas.

### CD: Entrega Continua

Ser capaces de automatizar la puesta en mano (al cliente final) de la última versión de mi app.

### CD: Despliegue Continuo

Automaticamente instalo en el entorno de producción de mis clientes la última versión de mi software.

# Metodologías ágiles: Scrum, Xtrem Programming

Nuevas formas de enfrentarnos a la gestión de un proyecto de software.

Vienen a reemplazar a las metodologías en cascada (v, espiral).
    Requisitos -> El día 1 era capaz de hacer una toma de requisitos perfecta
        Analisis ->
            Planificación ->
                Desarrollo ->
                    Pruebas ->
                        Documentación ->
                            Implantación ->
                                Formación
Hito
Entrega que hacemos en una fecha al cliente... con una determina funcionalidad
                           *****                       ***********************

Iteración - Sprint - 2 semanas- 2 meses
Entrega que hacemos en una fecha al cliente... con una determina funcionalidad
                           *****                       ***********************
                          10 de mayo                    10 puntos A.. J
                          10 de mayo se instala en cliente
                          en producción                 A,C,G,J

Iteración 1- Entrega 1 - 20% de la funcionalidad - 100% funcional - 3 semanas
Iteración 2- Entrega 2 - 30% de la funcionalidad - 100% funcional - 3 semanas
Si instalo en producción??? Qué implica eso? Pruebas ... por un tubo.
No tengo pasta para tanto... A este problema solo hay una solución: AUTOMATIZAR

Entorno no productivos:
- Integración / Preproducción / Desarrollo / Testing / Calidad

El el cliclo de vida de una app:

- Planificación: MANUBRIO
- Desarrollo: A MANO
- BUILD: Compilación/Empaquetado:   QUIEN???            EQ. DESARROLLO
    - ANT
    - JAVA: MAVEN, GRADLE, SBT
    - .NET: MSBUILD
    - JS:   NPM/Webpack
- Ejecución de las pruebas automatizada:    QUIEN??     EQ. TESTING
    - Tipo de pruebas:
        - Dinámicas
            - Funcionales:
                - Unitarias:            JUNIT, TEST-NG, UNITTEST, MSTEST
                - Integración
                - Sistema
                - Aceptación
            - Rendimiento:              JMeter, LoadRunner
            - UI:                       
                - Web                   Selenium, UFT
                - App mobile            Appium
        - Estáticas
            - SonarQube
- Instalación en entornod e integración... producción: QUIEN??? Sistemas... 
    - Scripts bash / python
    - Configuración e instalación de entornos: Ansible, Puppet, Chef...
    - Crear un entorno nuevo: Adquirir infraestructura: Terraform
    - Crear una máquina virtual... o varias: Vagrant

# JENKINS ???

Orquestador de tareas.

# Otras herramientas tipo Jenkins? 

TravisCI
TFS - Azure DevOps
Gitlab CI/CD
Github CI/CD
Hudson
Atlassian : Bamboo
JetBrains : TeamCity 
Cloudbees? Empresa... que está detrás del desarrollo de Jenkins

Hudson < Jenkins (OpenSource y Freeware) < CloudBees (Versión de pago + soporte ) 
OpenOffice < LibreOffice
MySQL < MariaDB

# Instalaciones

## En entornos de desarrollo / pruebas

En ocasiones los tengo.. en otras los tengo que crear

## En entornos de producción

### Caracteristicas

- Escalabilidad:       Capacidad de que el entorno se **ajuste** a la demanda puntual, de un momento dado

- Alta disponibilidad: **Intentar garantizar** un determinado tiempo de servicio
    90% RUINA !!!! - 10 dias 1 off.. 36,5 dias al año el sistema fuera                          |   €
    99             - 1 dia de cada 100 off... 3,5 dias al año. Peluqueria del barrio.           |   €€
    99.9%          - 100 dias 1 off         8 horas al año. Actualizaciones, paradas mnto,      |   €€€€
                     backups... fallos                                                          |
    99.99%         - minutos off al año                                                         V   €€€€€€€€€€€

Cluster: Replicación: 
    Activo / Pasivo
    ON       StandBy


App día 1:       100 usuarios   |
    dia 100:   10000 usuarios   |   Muy normal
    dia 1000: 100000 usuarios   V
    
INTERNET:
App dia n:       100 usuarios            
    dia n+1: 1000000 usuarios   black friday
    dia n+2:    5000 usuarios   
    dia n+3: 3000000 usuarios   ciber monday            *****

# Cloud 

Es el conjunto de servicios que una empresa ofrece a través de internet automatizadamente y relacionados con el mundo IT.

- Amazon: AWS
- Microsoft: AZURE
- Google: GCP

Un tipo de sevicios: IaaS < Alquiler

# Contenedores

Un entorno aislado donde ejecutar procesos dentro de un SO Linux.

Aislado en cuanto a qué?
- Su propia configuración de red < IP
- Su propio sistema de archivos (FileSystem)
- Limitación de acceso a recursos del hierro
- Sus propias variables de entorno
Todo ello gracias a funcionalidades que existen SOLO en creadas para ello en LINUX.

Un contenedor se crea mediante una imagen de contenedor.

A día de hoy TODO el software empresarial se distribuye mediante imágenes de contenedor.

## Qué es una imagen de contenedor?

Archivo comprimido (tar) que lleva dentro un conjunto de programas YA INSTALADOS POR ALGUIEN.

Puedo entonces ejecutar contenedores en Windows? NO
Puedo entonces ejecutar contenedores en MacOS?   NO

Hay truco:
- Docker desktop form Windows, MacOS:
    Monta una maquina virtual linux dentro de la que corren los contenedores

Las imágenes de contenedor se descargan desde registries de repositorios de imágenes de contenedor:
- docker hub
- quay.io   <   Redhat


## Método tradicional para instalar/ejecutar una app

    App 1  + App 2 + App 3              Problemas:
    -----------------------                 - Qué pasa si app1 tiene un bug? CPU 100%, RAM, HDD, IO
              SO                                    app 1 > off
    -----------------------                         app 2 > off
            HIERRO                                  app 3 > off 
                                            - Incompatibilidades. 

## Máquinas virtuales

    App 1 | App 2 + App 3               Desventajas:
    -----------------------                 - Desperdicio de recursos
    SO    |      SO                         - Peor rendimiento
    -----------------------                 - Complejidad: Más SO que instalar, configurar, mantener
    MV 1  |      MV 2                       - Cada hipervisor es de su padre y de su madre.
    -----------------------     
        hipervisor: citrix, 
    vmware, virtualbox, hiperv, 
                kvm                
    -----------------------     
              SO                
    -----------------------     
            HIERRO              

## Contenedores

    App 1 | App 2 + App 3              
    -----------------------            
    C 1   |      C 2                   
    -----------------------     
    Gestor de contenedores:
    docker + podman + crio
          containerd
    -----------------------     
           SO Linux
    -----------------------     
            HIERRO              

#### Kubernetes / Openshift
    
Gestores de gestores de contenedores

# Perfil IT: devops

Que sabe un poco de todo aunque no mucho de nada ... y es pacaz de montar y configurar un Jenkins o equivalente


# git? Un sistema de control de versión

Linus Torwalds + cvs > git 

cvs: subversion
     mercurial

git? quién lo hizo? 
√ Kernel SO más usado en el mundo con diferencia abrumal: Linux < Android
SCM: más utilizado en el mundo: git

Microsoft TFS > git > github

# Tipos de software
- Servicios
- Demonios
- Scripts               Secuencia de trabajos que se inicia, se ejecutan.. y acaban
- Comandos
- ------------------^ Puede ir como contenedor
- Aplicaciones
- Drivers
- SO


Kubernetes / Openshift < 
    Maquina 1
        docker o equivalente
    Maquina 2
        docker o equivalente
    Maquina 3
        docker o equivalente
        tomcat
    Maquina 4
        docker o equivalente
        cont. mysql

App1 web JAVA > git 

Entorno de integración:
    maven -> codigo app -> war -> "tomcat" + java > imagen de contendor que dentro lleve tomcat ya configurado y app

Entorno de empaquetado:                 A LA BASURA !!!!
    maven + java < codigo  > war

Entorno donde instalalo: java + tomcat entorno para hacer las pruebas >>>>   A LA BASURA !!!!

jmeter <                                                                  A LA BASURA !!!!
selenium + chrome                                                         A LA BASURA !!!!



# Al crear un contenedor:

$ docker container create \
    --name mijenkins      \
    -p 8080:8080          \
    -v /home/ubuntu/environment/datos/jenkins:/var/jenkins_home \
    cloudbees/jenkins-enterprise:latest
    
$ docker start mijenkins