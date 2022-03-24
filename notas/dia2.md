Jenkins instalado
    + Plugins

Maquina 1:
    Contenedor 1
        Jenkins app web + JAVA > Servidor de Aplicaciones JAVA (Tomcat)
        Aqui instalo herramientas? más vale que no... que lo voy a malear mucho
        
Entornos adicionales donde instalamos esas herramientas y donde se ejecutan los jobs: AGENT/Nodes
    - Estaticamente:            Ufff que peereza !!!
        maquina 2
            java
            maven
            jmeter
        maquina 3
            ansible
            python 2
        maquina 4
            python 3
    - Dinámicamente: Cloud
        Un cloud para Jenkins es alguien que le provee de manera automática de entornos donde ejecutar sus cosillas
        De agentes.
        Cuando usamos un cloud, jenkins cada vez que ejecuta una tarea, pide al cloud un entorno... lo usa y lo tira
        Cloud:
            - AWS
            - AZURE
            - GPC
            - Docker
            - Kubernetes

Jenkins
    Job - Definición de un trabajo (compuesto de tareas) que quiero que se ejecute < Script
        Distintos tipos.
    Puedo pedir a Jenkins que ejecute ese Job... y aquí hay distintas opciones:
        Ejecución manual
        Cron - Todos los martes a las 10:00
        Jenkins... mira a ver si ha cambiado el código en el SCM desarrollo... y si cambia, vamos pa'lla
    Ejecución de cada tarea...
        Quién las lleva a cabo? Jenkins? No... Jenkins ya os dije que lleva guantes blanquitos.
            Jenkins encomienda la ejecución de esas tareas a otros programas:
                git
                maven
                bash
                ansible
                terraform
                jmeter
                ...
            Jenkins sabe hablar con esos programas? Tampoco.. que no sabe na'!!!!
                Para hablar con esos programas necesitaremos el plugin adecuado
                
# Por ejemplo, para ejecutar una tarea de maven, necesitamos:
    + Plugin maven - Para enseñar a Jenkins a hablar con maven
    + maven versión *************
    + java versión
    
# Por ejemplo, para ejecutar una tarea de ansible, necesitamos:
    + Plugin ansible
    + ansible version ************
    + python version
    
    
Job:
    Información general: 
        Nombre
        Descripción
        ....
    Secuencia de tareas:
        Tarea 1
        Tarea 2
        ...
        Tarea N
    Cuándo se debe ejecutar el job
        Ejecución manual
        Cron - Todos los martes a las 10:00
        Jenkins... mira a ver si ha cambiado el código en el SCM desarrollo... y si cambia, vamos pa'lla
    Bien... ya se que tengo que hacer:
        Compilar
        Probar
        Instalar...
    SCM - git
    
    
En un job... al menos por ahora... ya veremos mas adelante que no.
2 tipos de tareas:
    Tareas de trabajo principales: Secuencia
        Compilar
        Prueba       FALLARON !!!
        Instala.     FALLO !
        Más pruebas
    Post-tareas
        Una vez acabado el trabajo principal (OJO: que puede haber ido bien o no)
        Hay tareas adicionales que quiero hacer. Por ejemplo?
        - Mandar un email
        - Guarda el resultado de la compilación
        - Guarda el resultado de ejecución de las pruebas

Cuando una tarea principal falla > YA NO SE EJECUTAN MAS TAREAS PRINCiPALES

Cuando se ejecuta un JOB, la primera vez, se genera una caperta en el Nodo/agente.
Que va a haber en esa carpeta?
De hecho nada... hasta que yo no ponga cosas.
¿Hasta cuando va a estar alli ese fichero?      POR LOS SIGLOS DE LOS SIGLOS
                                                o hasta que lo borre
La carpeta de trabajo: WORKSPACE VA ASOCIADA A proyceto/job no a una ejecución
    
    Si empaqueto, tendré un fichero: *.war
    Si empaqueto otra vez, machacaré el fichero *.war por otro *.war 
    
    Si genero pruebas , tendré un fichero reporte.xml
    Si vuelvo a generar pruebas , tendré un fichero reporte.xml actualizado.. pero el viejo le perdí
    
codigo java
maven compila + pruebas EXPLOSION
.war / .jar
--------
reporte.xml < guardar           POST tarea


Un trabajo/job/tarea... siempre quiero que se ejecute de la misma forma? Igual NO

Por entorno:
Instalación:
    Maquina 1: desarrollo
    Maquina 2: produccion