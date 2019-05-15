## **2.2.2**   **ESPECIFICACION CASOS DE USO**


| **Caso de Uso** | **Configurar Sistema** | **CU1** |
| --- | --- | --- |
| **Actores** | ACADEMIA |
| **Tipo** | Primario |
| **Referencias** |  RF1 RF2 RF3|   |
| **Precondición** | El actor, se encuentra autenticado en el sistema con perfil ACADEMIA |
| **Postcondición** | . |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor realiza el mantenimiento de la Aplicación. |
| **Importancia** | MEDIA | **Urgencia** | Media |



| **Caso de Uso** | **Consulta lista Departamentos** | **CU2** |
| --- | --- | --- |
| **Actores** | ACADEMIA |
| **Tipo** | Primario |
| **Referencias** |  RF1 RF2 RF3|   |
| **Precondición** | El actor, se encuentra autenticado en el sistema con perfil ACADEMIA |
| **Postcondición** | El sistema una vez comprobado los filtros introducidos por el actor, accede a la base de datos y muestra una lista con los departamentos que cumplan las condiciones de filtrado… |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor accede a la opción de consulta de departamentos. |
| **Importancia** | MEDIA | **Urgencia** | Media |



| **Caso de Uso** | **Mantenimiento Departamento** | **CU3** |
| --- | --- | --- |
| **Actores** | ACADEMIA |
| **Tipo** | Primario |
| **Referencias** | RF4 RF5 | CU2 |
| **Precondición** | El actor ha realizado la consulta lista Departamentos |
| **Postcondición** | El sistema realiza una de las acciones CRUD sobre el departamento Seleccionado |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona uno de los departamentos de la consulta de Departamentos y le permite realizar CRUD sobre el departamento seleccionado. |
| **Importancia** | MEDIA | **Urgencia** | Media |

| **Caso de Uso** | **Consultar Lista de Alumnos** | **CU4** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** | RF5 RF6 RF7  |   |
| **Precondición** | El actor, se encuentra autenticado en el sistema con su perfil |
| **Postcondición** | El sistema una vez comprobado los filtros introducidos por el actor, accede a la base de datos y muestra una lista con los Alumnos que cumplan las condiciones de filtrado… |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor accede a la opción de consulta de Alumnos. |
| **Importancia** | ALTA | **Urgencia** | ALTA |



| **Caso de Uso** | **Consultar Alumno** | **CU5** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO, |
| **Tipo** | Primario |
| **Referencias** | RF5 RF6 RF7  | CU4 |
| **Precondición** | El actor ha realizado la consulta lista de Alumnos |
| **Postcondición** | El sistema accede a la base de datos y muestra una lista con los datos del Alumno seleccionado |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor accede a la consulta de un Alumno |
| **Importancia** | ALTA | **Urgencia** | ALTA |



| **Caso de Uso** | **Mantenimiento Alumno** | **CU6** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO, ALUMNO |
| **Tipo** | Primario |
| **Referencias** |  RF5 RF6 RF7 RF10 RF11 RF12 RF13 RF14 RF15 |  CU5 |
| **Precondición** | El actor ha realizado la consulta de Alumno |
| **Postcondición** | El sistema realiza una de las acciones CRUD sobre el Alumno Seleccionado |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona uno de los Alumnos de la consulta de Departamentos y le permite realizar CRUD sobre el Alumno seleccionado. |
| **Importancia** | ALTA | **Urgencia** | ALTA |



| **Caso de Uso** | **Consultar Lista de Cursos** | **CU7** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** | RF6 RF7 RF8 RF9 RF10 RF17 RF18 |   |
| **Precondición** | El actor, se encuentra autenticado en el sistema con su perfil |
| **Postcondición** | El sistema una vez comprobado los filtros introducidos por el actor, accede a la base de datos y muestra una lista con los Cursos que cumplan las condiciones de filtrado… |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor accede a la opción de consulta de Cursos. |
| **Importancia** | ALTA | **Urgencia** | ALTA |



| **Caso de Uso** | **Consultar Curso** | **CU8** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO, |
| **Tipo** | Primario |
| **Referencias** |  RF4 RF6 RF7 RF8 RF9 RF10 RF17 RF18  |  CU7 |
| **Precondición** | El actor ha realizado la consulta lista de Cursos |
| **Postcondición** | El sistema accede a la base de datos y muestra una lista con los datos del Curso seleccionado |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor accede a la consulta de un Curso |
| **Importancia** | ALTA | **Urgencia** | ALTA |


| **Caso de Uso** | **Mantenimiento Curso** | **CU9** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** | RF4 RF5 RF6 RF7 RF8 RF9 RF10  |  CU8 |
| **Precondición** | El actor ha realizado la consulta de Curso |
| **Postcondición** | El sistema realiza una de las acciones CU(Create, Update) sobre el Curso Seleccionado |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona uno de los Cursos de la consulta de Departamentos y le permite realizar CU(Create, Update)  sobre el Curso seleccionado. |
| **Importancia** | ALTA | **Urgencia** | ALTA |



| **Caso de Uso** | **Eliminar Curso** | **CU10** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** |  RF4 RF18 |  CU9, CU16 |
| **Precondición** | El actor ha realizado la consulta de Curso |
| **Postcondición** | El sistema realiza la eliminación sobre el Curso Seleccionado que incluye la eliminación de datos filiación Alumnos |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona uno de los Cursos de la consulta de Departamentos y le permite realizar eliminar el Curso seleccionado. |
| **Importancia** | ALTA | **Urgencia** | ALTA |



| **Caso de Uso** | **Promocionar Curso** | **CU11** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** |  RF10 | CU8, CU15 |
| **Precondición** | El actor ha realizado la consulta de Curso |
| **Postcondición** | El sistema genera un nuevo curso con los mismos alumnos, borrando las asignaturas y permitiendo asignar nuevas asignaturas |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona uno de los Cursos de la consulta de Departamentos y le permite realizar promocionar el Curso seleccionado. |
| **Importancia** | baja | **Urgencia** | baja |



| **Caso de Uso** | **Duplicar Curso** | **CU12** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** | RF5 RF6 RF7 RF8 RF9  | CU1, CU9, CU17 |
| **Precondición** | El actor ha realizado la consulta de Curso |
| **Postcondición** | El sistema genera un nuevo curso con las mismas asignaturas, desasignado los alumnos y permitiendo asignación de nuevos alumnos |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona uno de los Cursos de la consulta de Departamentos y le permite realizar duplicar el Curso seleccionado. |
| **Importancia** | baja | **Urgencia** | baja |



| **Caso de Uso** | **Cerrar Curso** | **CU13** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** | RF4  | CU8, CU16 |
| **Precondición** | El actor ha realizado la consulta de Curso |
| **Postcondición** | El sistema elimina datos filiación alumnos asignados al curso cerrado y cambia de ubicación en la base de datos el curso cerrado para que no se pueda modificar |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona uno de los Cursos de la consulta de Departamentos y le permite cerrar el Curso seleccionado. |
| **Importancia** | baja | **Urgencia** | baja |



| **Caso de Uso** | **Consultar Asignaturas** | **CU14** |
| --- | --- | --- |
| **Actores** | DEPARTAMENTO, ACADEMIA, ALUMNO |
| **Tipo** | Primario |
| **Referencias** | RF4 RF8 RF9 RF10 RF12 RF13 RF16 RF17 RF18 |  C14, CU8 |
| **Precondición** | El actor ha realizado la consulta lista de ASIGNATURAS |
| **Postcondición** | El sistema accede a la base de datos y muestra una lista con los datos de la Asignatura seleccionado |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor accede a la consulta de una Asignatura |
| **Importancia** | ALTA | **Urgencia** | ALTA |



| **Caso de Uso** | **Mantenimiento Asignatura** | **CU15** |
| --- | --- | --- |
| **Actores** | DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** |  RF4 RF8 RF9 RF10 RF13 RF16 RF17 | CU1 CU9 |
| **Precondición** | El actor ha realizado la consulta de Asignaturas |
| **Postcondición** | El sistema realiza una de las acciones CRUD sobre la asignatura Seleccionada |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona una de las Asignaturas de la consulta de Asignaturas y le permite realizar CRUD sobre la Asignatura seleccionada. |
| **Importancia** | ALTA | **Urgencia** | ALTA |



| **Caso de Uso** | **Eliminar datos Filiación Alumno** | **CU16** |
| --- | --- | --- |
| **Actores** | DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** |  RF4 RF7 RF12 | CU5, CU13 |
| **Precondición** | El actor ha cerrado un curso |
| **Postcondición** | El sistema accede a la base de datos y elimina los datos de filiación de los alumnos del curso cerrado y cambia de ubicación el curso cerrado |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona eliminar datos de filiación en la opción de cerrar curso. |
| **Importancia** | BAJA | **Urgencia** | BAJA |



| **Caso de Uso** | **Asignar Alumno** | **CU17** |
| --- | --- | --- |
| **Actores** | DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** | RF6  | CU1, CU10, CU13 |
| **Precondición** | El actor: ha consultado un alumno o ha realizado mantenimiento de un curso o ha Duplicado un curso |
| **Postcondición** | El sistema accede a la base de datos y relaciona a un alumno con un curso. |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona asignar alumno a un curso. |
| **Importancia** | BAJA | **Urgencia** | BAJA |



| **Caso de Uso** | **Consultar mis Cursos** | **CU18** |
| --- | --- | --- |
| **Actores** | ALUMNO |
| **Tipo** | Primario |
| **Referencias** | RF16  | CU1 |
| **Precondición** | El actor, se encuentra autenticado en el sistema con perfil ALUMNO |
| **Postcondición** | El sistema accede a la base de datos muestra los datos de los cursos del ALUMNO validado en el sistema |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona consultar mis Cursos. |
| **Importancia** | BAJA | **Urgencia** | BAJA |



| **Caso de Uso** | **Consultar mi Curso** | **CU19** |
| --- | --- | --- |
| **Actores** | ALUMNO |
| **Tipo** | Primario |
| **Referencias** |  RF12 RF16 | CU1 CU20 |
| **Precondición** | El actor, ha consultado el listado de sus cursos |
| **Postcondición** | El sistema accede a la base de datos muestra los datos del curso seleccionado |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona consultar un curso del listado de mis Cursos. |
| **Importancia** | BAJA | **Urgencia** | BAJA |



| **Caso de Uso** | **Consultar Lista de Usuarios** | **CU20** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO, ALUMNO |
| **Tipo** | Primario |
| **Referencias** | RF1 RF2 RF3 RF4 RF6 RF7 | CU1 |
| **Precondición** | El actor, se encuentra autenticado en el sistema con su perfil |
| **Postcondición** | El sistema una vez comprobado los filtros introducidos por el actor, accede a la base de datos y muestra una lista con los Usuarios que cumplan las condiciones de filtrado… |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor accede a la opción de consulta de Usuarios. |
| **Importancia** | media | **Urgencia** | media |



| **Caso de Uso** | **Consultar Usuario** | **CU21** |
| --- | --- | --- |
| **Actores** | ACADEMIA, DEPARTAMENTO, ALUMNO |
| **Tipo** | Primario |
| **Referencias** | RF12 RF16 RF17  |   |
| **Precondición** | El actor se encuentra en la consulta de Lista de Usuarios |
| **Postcondición** | El sistema realiza una de las acciones CRUD sobre el Usuario seleccionado |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona uno de los Usuarios de la consulta de Departamentos y le permite realizar CRUD sobre el Usuario seleccionado. |
| **Importancia** | media | **Urgencia** | media |


| **Caso de Uso** | **Asignar Nota Asignatura** | **CU22** |
| --- | --- | --- |
| **Actores** | DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** | RF13  |   |
| **Precondición** | El actor se encuentra en mantenimiento de Alumno |
| **Postcondición** | El sistema realiza una asignación de una nota una asignatura del Alumno |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona asignar nota asignatura sobre el Alumno seleccionado. |
| **Importancia** | media | **Urgencia** | media |



| **Caso de Uso** | **Apuntar Faltas a Clase** | **CU23** |
| --- | --- | --- |
| **Actores** | DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** | RF14  |   |
| **Precondición** | El actor se encuentra en mantenimiento de Alumno |
| **Postcondición** | El sistema accede a la base de datos y escribe una falta a Clase del Alumno |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona apuntar falta a Clase sobre el Alumno seleccionado. |
| **Importancia** | media | **Urgencia** | media |



| **Caso de Uso** | **Solicitar Permiso** | **CU24** |
| --- | --- | --- |
| **Actores** | ALUMNO |
| **Tipo** | Primario |
| **Referencias** |  RF5 RF6 RF7 RF15 RF16 | CU5 |
| **Precondición** | El actor se encuentra en Consultar Alumno |
| **Postcondición** | El sistema accede a la base de datos y escribe una solicitud de permiso del Alumno. 
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona Solicitar permiso. |
| **Importancia** | media | **Urgencia** | media |



| **Caso de Uso** | **Validar Permiso** | **CU25** |
| --- | --- | --- |
| **Actores** | DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** | RF15  | CU24 |
| **Precondición** | El actor se encuentra en mantenimiento Alumno |
| **Postcondición** | El sistema accede a la base de datos y realiza CRUD sobre la solicitud Permiso de Alumno |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona Validar permiso. |
| **Importancia** | media | **Urgencia** | media |



| **Caso de Uso** | **Crear Alumno** | **CU26** |
| --- | --- | --- |
| **Actores** | DEPARTAMENTO |
| **Tipo** | Primario |
| **Referencias** | RF5  | CU5 |
| **Precondición** | El actor se encuentra en MANTENIMIENTO ALUMNO |
| **Postcondición** | El sistema accede a la base de datos y realiza la creación de un alumno que implica  la creación de un usuario tipo Alumno |
| **Autor** | Analista | Fecha | 11/05/19 | Versión | 1.0 |
| **Descripción** | El actor selecciona Crear Alumno. |
| **Importancia** | media | **Urgencia** | media |
