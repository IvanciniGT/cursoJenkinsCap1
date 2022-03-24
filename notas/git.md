SCM: distribuido

distribuido?? vs centralizado: cvs, svn

No tenemos un único repositorio... hay muchos repositorios... TODOS DIFERENTES ENTRE SI

Cuando trabajos con git, trabajmamos en 3/4 zonas diferentes:
- WorkingDir (carpeta)
- Area de preparación (staging)
- Repo local
---- 
- Repo(s) remoto(s). De 0 a infinito

------
Commit: Una foto completa de mi proyecto en un momento dado. BACKUP
Donde se genera un commit? En una rama
Rama? Una linea temporal paralela donde se van realizando cambios en un proyecto.


                    Tiempo
                    VVVV
Backup? Foto en un momento dado                 Backup 1 - Commit 1.  T1
        Otra foto en otro momento dado          Backup 2 - Commit 2.  T2
                                                                    T1 < T2
        
        Como son esos backups: SECUENCIALES en el tiempo

El código de un proyecto no evoluciona así...
    En un mismo momento dado en el timpo T1, tenemos multiples versiones paralelas del proyecto, 
                                             evolucionando de forma independiente.   LOKI: Variantes!

Ejemplos:
    Ejemplo1:
        - Menchu -> Funcionalidad 1
        - Lucas  -> Funcionalidad 2
            programa.java   ---> Menchu -> su evolución
                            ---> Lucas  -> su propia evolución diferente
                            
    Ejemplo2:
        - v1.0.1 -> Producción *BUG Funcion17
            Producción v1.0.1 > v1.0.2                  HOTFIX
        - v1.1.0 -> Desarrollo - 3 meses 
            La funcion 17 ha sido eliminada en la proxima versión.

    
                            Repo remoto
                            - main
                            - rama desarrollo C10, C9, C14
                                |
  ------------------------------------------------------------         
  |                                                          |
MenchuPC                                                LucasPortatil
- Carpeta                                                   - Carpeta
- Area de preparacion                                       - Area de preparacion
- Repo .git                                                 - Repo
    - rama main C1, C5                                             - rama main   C1, C5
    - rama desarrollo C10, C9 , C14                                - rama desarrollo    C10, C9, C14
    - rama menchu  C10                                             - lucas rama     C14

REGLA DE ORO: main
Nunca jamas en la vida hago un commit en ella!
Lo que hay en esa rama entiendo que? está listo para producción