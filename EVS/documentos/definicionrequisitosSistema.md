# **EVS 3.- DEFINICIÓN DE REQUISITOS DEL SISTEMA**

## **EVS 3.1.- IDENTIFICACIÓN DE LAS DIRECTRICES Y TÉCNICAS DE GESTIÓN**

El desarrollo de la aplicación se ajustará a la metodología MÉTRICA v.3.0 en cuanto a documentación, y a la metodología SCRUM en cuanto a planificación, análisis, desarrollo y construcción de sistemas de información.

## **EVS 3.2/3.3.- IDENTIFICACIÓN Y CATALOGACIÓN DE REQUISITOS**

### 1. Requisitos Funcionales

| REQUISITO | FUENTE | DESCRIPCION | PRIORIDAD |
| --- | --- | --- | --- |
| RF1 | CLIENTE | El acceso al Sistema se hará con identificación de usuarios mediante diferentes perfiles de acceso y privilegios: Administrador / Alumno. | Alta |
| RF2 | CLIENTE | El Sistema permitirá que el Administrador pueda dar de alta un nuevo curso. | Alta |
| RF3 | CLIENTE | El Sistema permitirá que el Administrador pueda duplicar la descripción de un curso. | Baja |
| RF4 | CLIENTE | El Sistema permitirá que un usuario pueda registrarse para acceder a la aplicación a través de un enlace web que recibirá por correo electrónico y que lo asignará como Alumno a un curso concreto una vez que el Administrador lo valide. | Alta |
| RF5 | CLIENTE | El Alumno podrá visualizar su expediente. | Alta |
| RF6 | CLIENTE | El Alumno podrá modificar y borrar sus datos básicos. | Alta |
| RF7 | CLIENTE | El Administrador podrá introducir las notas obtenidas por cada Alumno en una asignatura. | Alta |
| RF8 | CLIENTE | El Administrador podrá registrar las faltas de asistencia que tenga un Alumno. | Alta |
| RF9 | CLIENTE | El Alumno podrá solicitar permisos a través de la aplicación y comprobar el estado de los mismos (tramitado / aceptado / rechazado). | Alta |
| RF10 | CLIENTE | El Administrador podrá modificar el estado de los permisos solicitados por un Alumno (aceptado / rechazado). | Media |
| RF11 | CLIENTE | El Sistema deberá mostrar el expediente de un Alumno. | Alta |
| RF12 | CLIENTE | El Administrador podrá consultar y obtener diferentes listados. | Alta |
| RF13 | CLIENTE | El Administrador podrá finalizar un curso, suponiendo que a partir de dicho momento no se podrán modificar los datos relativos a dicho curso. | Media |
| RF14 | CLIENTE | El Sistema borrará los datos de filiación de los alumnos pertenecientes a cursos finalizados, permaneciendo únicamente los datos de contacto. | Media |
| RF15 | CLIENTE | El Sistema deberá almacenar un histórico de todos los cursos finalizados y no borrados permitiendo la consulta por parte del Administrador. | Media |
| RF16 | CLIENTE | El Administrador podrá acceder a los datos de contacto de los antiguos alumnos. | Baja |

### 2. Requisitos No Funcionales

| REQUISITO | FUENTE | DESCRIPCION | PRIORIDAD |
| --- | --- | --- | --- |
| RNF1 | CLIENTE | El Sistema deberá ser accesible desde internet. | Alta |
| RNF2 | CLIENTE | El Sistema deberá programarse en entorno WEB (_responsive_ y para todos los navegadores), con lenguaje Java. | Alta |
| RNF3 | CLIENTE | El Sistema deberá ser capaz de operar adecuadamente con hasta **20** usuarios con sesiones concurrentes. | Media |
| RNF4 | CLIENTE | El Sistema obligará a que las fotografías tengan un tamaño de 650 x 945 píxeles y un tamaño máximo de 10 KB. | Alta |

### 3. Restricciones

La principal restricción con la que nos encontramos en este proyecto es la temporal, dado que al tratarse de un proyecto de prácticas el tiempo está limitado a los 2 meses de duración de la asignatura de Dirección y Gestión de Proyectos del Curso DIM.