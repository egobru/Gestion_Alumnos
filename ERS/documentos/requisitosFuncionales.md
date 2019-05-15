## **2.1.5.**        **REQUISITOS FUNCIONALES.**

| Identificación | RF1 |
| --- | :--- |
| Descripción | El administrador del sistema podrá crear usuarios administradores de departamento, para lo que deberá indicar:<ul>- Usuario (email)</ul><ul>- Contraseña inicial</ul><ul>- Departamento que administrará</ul> |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Alta |
| Relacionado con | RSEG1 |

| Identificación | RF2 |
| --- | :--- |
| Descripción | El administrador del sistema podrá crear departamentos nuevos, para lo que deberá indicar:<ul>- Nombre del departamento</ul><ul>- Usuario administrador del departamento</ul> |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Alta |
| Relacionado con | RSEG1, RF1 |

| Identificación | RF3 |
| --- | :--- |
| Descripción | El administrador del departamento podrá crear cursos y modificar los datos de estos cursos, permitiéndole introducir, modificar o eliminar:<ul>- Fecha de inicio y finalización</ul><ul>- Asignaturas que se impartirán</ul><ul>- Alumnos que recibirán la formación</ul> |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Alta |
| Relacionado con |   |

| Identificación | RF4 |
| --- | :--- |
| Descripción | El administrador del departamento podrá dar de alta usuarios alumno que vayan a recibir la formación de un curso y no estén dados de alta en el sistema para lo que deberá indicar:<ul>- Email</ul><ul>- Contraseña inicial</ul> |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Media |
| Relacionado con | RSEG1, RF1 |

| Identificación | RF5 |
| --- | :--- |
| Descripción | El administrador del departamento podrá asignar alumnos a un curso del que sea administrador. |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Alta |
| Relacionado con |   |

| Identificación | RF6 |
| --- | :--- |
| Descripción | El administrador del departamento podrá introducir o modificar los datos correspondientes a la ficha del alumno de aquellos usuarios alumnos que pertenezcan a su curso. |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Alta |
| Relacionado con |   |

| Identificación | RF7 |
| --- | :--- |
| Descripción | El administrador del departamento podrá modificar los datos de una asignatura:<ul>- Nombre de la asignatura</ul><ul>- Peso específico sobre el cómputo total del curso</ul> |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Alta |
| Relacionado con | RF3 |

| Identificación | RF8 |
| --- | :--- |
| Descripción | El administrador del departamento podrá duplicar un curso, para lo que el sistema le solicitará que le asigne un nuevo nombre al curso. Posteriormente se copiarán las asignaturas que componen el curso, y quedará pendiente de indicar las fechas del curso y los alumnos que recibirán la formación. |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Media |
| Relacionado con | RF2 |

| Identificación | RF9 |
| --- | :--- |
| Descripción | El administrador del departamento podrá promocionar a los alumnos de un curso, solicitando el sistema si los alumnos serán promocionados a un curso existente o a un curso nuevo.<br/> Si el administrador decide la creación de un nuevo curso deberá asignarle un nuevo nombre. Posteriormente se asignarán los alumnos promocionados al curso nuevo creado, y quedarán pendiente de indicar las fechas del curso y las asignaturas que se impartirán. |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Media |
| Relacionado con | RF2, RF8 |

| Identificación | RF10 |
| --- | :--- |
| Descripción | El alumno tendrá que rellenar en su primer acceso al sistema su ficha de alumno que consta de:<ul>- Datos militares (en caso de ser militar o guardia civil): nombre y apellidos, NIF, empleo, ejército, cuerpo, escala, número de escalafón, email, destino anterior.</ul><ul>- Datos personales: domicilio, ciudad, provincia, código postal, teléfono móvil, email particular.</ul><ul>- Otros datos: vehículo 1, vehículo  2. Los datos a almacenar de los vehículos son marca, modelo, color y matrícula.</ul>|
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Media |
| Relacionado con | RF5 |

| Identificación | RF11 |
| --- | :--- |
| Descripción | El alumno podrá visualizar su expediente personal, pudiendo modificar o eliminar cualquier dato de su ficha de alumno. Del dato modificado o eliminado no se almacenará un histórico debiendo ser eliminado del sistema. |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Media |
| Relacionado con | RF10 |

| Identificación | RF12 |
| --- | :--- |
| Descripción | El administrador del departamento podrá introducir o modificar las notas obtenidas por los alumnos en las asignaturas recibidas. |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Alta |
| Relacionado con | RF3, RF4, RF7 |

| Identificación | RF13 |
| --- | :--- |
| Descripción | El administrador del departamento podrá reflejar las faltas de asistencia que un alumno tenga durante el desarrollo de un curso. |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Alta |
| Relacionado con |   |

| Identificación | RF14 |
| --- | :--- |
| Descripción | El alumno podrá solicitar permisos para ausentarse por un periodo determinado a un curso que esté realizando, para lo que se almacenará el estado del permiso como &quot;tramitado&quot; y debiendo el administrador del departamento cambiarlo de estado a &quot;aprobado&quot; o &quot;denegado&quot;. |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Baja |
| Relacionado con |   |

| Identificación | RF15 |
| --- | :--- |
| Descripción | El alumno podrá visualizar su expediente académico que constará del histórico de cursos presentes y pasados, permitiéndole acceder para cada curso su expediente de notas, las faltas de asistencia anotadas y los permisos solicitados. |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Baja |
| Relacionado con |   |

| Identificación | RF16 |
| --- | :--- |
| Descripción | El sistema permitirá al administrador del departamento generar una serie de listados en PDF:<ul>- Listado con o sin fotografía de los alumnos ordenados por antigüedad</ul><ul>- Listado de los alumnos con detalle de los datos de contacto que se seleccionen de los que se incluyen en la ficha del alumno</ul><ul>- Listado para cada asignatura de las notas obtenidas por los alumnos</ul><ul>- Listado de los alumnos ordenados por la nota media obtenida en el curso</ul> |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Media |
| Relacionado con |   |

| Identificación | RF17 |
| --- | :--- |
| Descripción | El sistema almacenará un histórico de los cursos que los administradores de departamento finalicen. Del histórico, el administrador del departamento podrá acceder a la información del curso, los expedientes de notas de los alumnos, las faltas de asistencia y permisos de los alumnos, y los datos militares de los mismos. Por lo que no se podrá acceder a los datos personales de los alumnos a través del histórico de cursos. |
| Tipo | Requisito |
| Fuente | Product Owner |
| Prioridad | Baja |
| Relacionado con |   |
