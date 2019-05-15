# **2.1.5.**        **REQUISITOS FUNCIONALES.**

| Identificación | **RF1** |
| --- | --- |
| Descripción | El acceso al sistema se realizará mediante un login de usuario (email) y contraseña. El sistema identificará al usuario y reconocerá el perfil de acceso asignado y los roles autorizados. Los perfiles de usuario que existirán son:
- --Administrador del sistema
- --Administrador del departamento
- --Alumno
 |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente |   |
| Prioridad |
Alta
 |
Media
 |
Baja
 |
| Relacionado con |   |

| Identificación | **RF2** |
| --- | --- |
| Descripción | El administrador del sistema podrá crear usuarios administradores de departamento, para lo que deberá indicar:
- --Usuario (email)
- --Contraseña inicial
- --Departamento que administrará
 |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 | Baja |
| Relacionado con | RF1 |

| Identificación | **RF3** |
| --- | --- |
| Descripción | El administrador del sistema podrá crear departamentos nuevos, para lo que deberá indicar:
- --Nombre del departamento
- --Usuario administrador del departamento
 |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 | Baja |
| Relacionado con | RF1, RF2 |

| Identificación | **RF4** |
| --- | --- |
| Descripción | El administrador del departamento podrá crear cursos y modificar los datos de estos cursos, permitiéndole introducir, modificar o eliminar:
- --Fecha de inicio y finalización
- --Asignaturas que se impartirán
- --Alumnos que recibirán la formación
 |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 | Baja |
| Relacionado con |   |

| Identificación | **RF5** |
| --- | --- |
| Descripción | El administrador del departamento podrá dar de alta usuarios alumno que vayan a recibir la formación de un curso y no estén dados de alta en el sistema para lo que deberá indicar:
- --Email
- --Contraseña inicial
 |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 |
Baja
 |
| Relacionado con | RF1, RF2 |

| Identificación | **RF6** |
| --- | --- |
| Descripción | El administrador del departamento podrá asignar alumnos a un curso del que sea administrador. |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 | Baja |
| Relacionado con |   |

| Identificación | **RF7** |
| --- | --- |
| Descripción | El administrador del departamento podrá introducir o modificar los datos correspondientes a la ficha del alumno de aquellos usuarios alumnos que pertenezcan a su curso. |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 | Baja |
| Relacionado con |   |

| Identificación | **RF8** |
| --- | --- |
| Descripción | El administrador del departamento podrá modificar los datos de una asignatura:
- --Nombre de la asignatura
- --Peso específico sobre el cómputo total del curso
 |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 | Baja |
| Relacionado con | RF4 |

| Identificación | **RF9** |
| --- | --- |
| Descripción | El administrador del departamento podrá duplicar un curso, para lo que el sistema le solicitará que le asigne un nuevo nombre al curso. Posteriormente se copiarán las asignaturas que componen el curso, y quedará pendiente de indicar las fechas del curso y los alumnos que recibirán la formación. |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 |
Baja
 |
| Relacionado con | RF3 |

| Identificación | **RF10** |
| --- | --- |
| Descripción | El administrador del departamento podrá promocionar a los alumnos de un curso, solicitando el sistema si los alumnos serán promocionados a un curso existente o a un curso nuevo. Si el administrador decide la creación de un nuevo curso deberá asignarle un nuevo nombre. Posteriormente se asignarán los alumnos promocionados al curso nuevo creado, y quedarán pendiente de indicar las fechas del curso y las asignaturas que se impartirán. |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 | Baja |
| Relacionado con | RF3, RF9 |

| Identificación | **RF11** |
| --- | --- |
| Descripción | El alumno tendrá que rellenar en su primer acceso al sistema su ficha de alumno que consta de:
- --Datos militares (en caso de ser militar o guardia civil): nombre y apellidos, NIF, empleo, ejército, cuerpo, escala, número de escalafón, email, destino anterior.
- --Datos personales: domicilio, ciudad, provincia, código postal, teléfono móvil, email particular.
- --Otros datos: vehículo 1, vehículo  2. Los datos a almacenar de los vehículos son marca, modelo, color y matrícula.
 |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 | Baja |
| Relacionado con | RF6 |

| Identificación | **RF12** |
| --- | --- |
| Descripción | El alumno podrá visualizar su expediente personal, pudiendo modificar o eliminar cualquier dato de su ficha de alumno. Del dato modificado o eliminado no se almacenará un histórico debiendo ser eliminado del sistema. |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 | Baja |
| Relacionado con | RF11 |

| Identificación | **RF13** |
| --- | --- |
| Descripción | El administrador del departamento podrá introducir o modificar las notas obtenidas por los alumnos en las asignaturas recibidas. |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 |
Baja
 |
| Relacionado con | RF4, RF5, RF8 |

| Identificación | **RF14** |
| --- | --- |
| Descripción | El administrador del departamento podrá reflejar las faltas de asistencia que un alumno tenga durante el desarrollo de un curso. |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 | Baja |
| Relacionado con |   |

| Identificación | **RF15** |
| --- | --- |
| Descripción | El alumno podrá solicitar permisos para ausentarse por un periodo determinado a un curso que esté realizando, para lo que se almacenará el estado del permiso como &quot;tramitado&quot; y debiendo el administrador del departamento cambiarlo de estado a &quot;aprobado&quot; o &quot;denegado&quot;. |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 | Media |
Baja
 |
| Relacionado con |   |

| Identificación | **RF16** |
| --- | --- |
| Descripción | El alumno podrá visualizar su expediente académico que constará del histórico de cursos presentes y pasados, permitiéndole acceder para cada curso su expediente de notas, las faltas de asistencia anotadas y los permisos solicitados. |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 | Media |
Baja
 |
| Relacionado con |   |

| Identificación | **RF17** |
| --- | --- |
| Descripción | El sistema permitirá al administrador del departamento generar una serie de listados en PDF:
- --Listado con o sin fotografía de los alumnos ordenados por antigüedad
- --Listado de los alumnos con detalle de los datos de contacto que se seleccionen de los que se incluyen en la ficha del alumno
- --Listado para cada asignatura de las notas obtenidas por los alumnos
- --Listado de los alumnos ordenados por la nota media obtenida en el curso
 |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 |
Media
 |
Baja
 |
| Relacionado con |   |

| Identificación | **RF18** |
| --- | --- |
| Descripción | El sistema almacenará un histórico de los cursos que los administradores de departamento finalicen. Del histórico, el administrador del departamento podrá acceder a la información del curso, los expedientes de notas de los alumnos, las faltas de asistencia y permisos de los alumnos, y los datos militares de los mismos. Por lo que no se podrá acceder a los datos personales de los alumnos a través del histórico de cursos. |
| Tipo |
Requisito
 |
Restricción
 |
| Fuente | Analista |
| Prioridad |
Alta
 | Media |
Baja
 |
| Relacionado con |   |