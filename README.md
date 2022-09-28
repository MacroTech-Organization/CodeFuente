# Descripción del proyecto

## Integrantes del Grupo



| NOMBRES | APELLIDOS      | ROLES         |
| ------- | -------------- | ------------- |
| Heberto | Lozano Ramirez | Desarrollador |
| Erika   | Lozano Ramirez | Scrum Master  |
| Jhoan   | Vega Martinez  | Data Base     |
|fabian|Avila|Product Owner|
| Andres | Pantoja Herrera | Analista |



Se requiere un aplicativo web para que un administrador pueda gestionar los ingresos y egresos de su empresa. El sistema debería permitir visualizar los totales de la empresa para que el gerente pueda tomar decisiones sobre la situación financiera. El procedimiento de registro de gastos y ventas es un proceso que puede ser tedioso, por lo que el administrador del sistema puede decidir delegar el registro a personal contable. Por tal motivo, la aplicación debe permitir la creación de nuevos usuarios que deben tener la posibilidad de efectuar nuevos movimientos de dinero. Sin embargo, dichos usuarios no deben ser capaces de modificar información sensible de la empresa, ni tampoco crear nuevos usuarios, con el fin de evitar riesgos de corrupción. Adicionalmente, debido a que las transacciones contables son supremamente delicadas, el sistema debería permitir llevar una trazabilidad de quién registró cada transacción, por lo cual el sistema debe contar con un sistema de autenticación.

### HISTORIA DE USUARIOS

1. Como usuario administrador, quiero poder crear una empresa en el sistema

2. Como usuario administrador, quiero poder agregar un nuevo empleado a mi empresa
3. Como usuario administrador, quiero poder agregar un ingreso de dinero a la empresa
4. Como usuario administrador, quiero poder agregar un egreso a la empresa
5. Como usuario operativo, quiero poder visualizar todos los gastos e ingresos de la empresa
6. Como usuario administrador, quiero poder visualizar todos los gastos e ingresos de la empresa

### PLANEACION

### Sprint 1

**OBJETIVO:* **Conformar un equipo de trabajo y definir roles.

| Sprint 1 | tarea                                                        | Definition of Done                                           |
| -------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| sprint 1 | Conformación de equipos de trabajo                           | El equipo tiene cinco personas                               |
| sprint 1 | Creación de una organización en GitHub                       | Existe un link para la organización de GitHub del equipo     |
| sprint 1 | Creación de un repositorio de ejemplo dentro de la organización, donde cada miembro evidencie un commit | Es posible evidenciar al menos un commit de cada miembro en un repositorio dentro de la organización |

> **SEMANA 1 Y 2**

##  Sprint 2

**OBJETIVO:** Crear clases para las entidades básicas de la aplicación.

**Actividades**

| Sprint 2 | Tarea                                                  | Definition of Done                                           |
| -------- | ------------------------------------------------------ | :----------------------------------------------------------- |
| Sprint 2 | Modelar una empresa como una clase de Java             | Es posible crear una instancia de la clase "Empresa" Es posible leer y modificar el nombre de la empresa Es posible leer y modificar la dirección de la empresa Es posible leer y modificar el teléfono de la empresa Es posible leer y modificar el NIT de la empresa |
| Sprint 2 | Modelar un empleado como una clase de Java             | Es posible crear una nueva instancia de la clase "Empleado" Es posible leer y modificar el nombre de un empleado Es posible leer y modificar el correo de un empleado Es posible leer y modificar la empresa a la que el empleado pertenece Es posible leer y modificar el rol del empleado (administrador, operativo) |
| Sprint 2 | Modelar el movimiento de dinero como una clase de Java | Es posible crear una nueva instancia de la clase "MovimientoDinero" Es posible leer y modificar el monto del movimiento Es posible crear montos positivos y negativos Es posible leer y modificar el concepto del movimiento Es posible definir qué usuario fue encargado de registrar el movimiento |



## Sprint 3

**OBJETIVO: **Crear el backend para la aplicación.

### ACTIVIDADES

| Sprint   | Tarea                                                        | Definition of Done                                           |
| -------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Sprint 3 | Crear controladores REST para la empresa                     | sistema devuelve responses 200 en la ruta /enterprises con los siguientes verbos:                                                                  **GET    POST **                                                                                       El sistema devuelve responses 200 en la ruta /enterprises/[id] con los siguientes verbos:                       **GET   PATCH   DELETE** |
| Sprint 3 | Crear controladores REST para los usuarios                   | El sistema devuelve reponses 200 en la ruta /users con los siguientes verbos: **GET POST   **                                                    El sistema devuelve responses 200 en la ruta /user/[id] con los siguientes verbos: **GET  PATCH  DELETE** |
| Sprint 3 | Crear controladores REST para los movimientos de una empresa especifica | El sistema devuelve reponses 200 en la ruta /enterprises/[id]/movements con los siguientes verbos: **GET  POST  PATCH  DELETE** |
| Sprint 3 | Crear servicios para la empresa                              | El sistema permite consultar todas las empresas                El sistema permite consultar una sola empresa                   El sistema permite crear una empresa                                  El sistema permite editar una empresa                                 El sistema permite eliminar una empresa |
| Sprint 3 | Crear servicios para el usuario                              | El sistema permite consultar todos los usuarios                   El sistema permite consultar un solo usuario                               El sistema permite crear un usuario                                                         El sistema permite editar un usuario                                                    El sistema permite eliminar un usuario |



#   SPRINT 4

**Objetivo** : Crear el frontend para la aplicación.

### Actividades

| Sprint   | Tarea                                                        | Definition of Done                                           |
| -------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Sprint 4 | Crear entidades y repositorios para la empresa               | La información de las empresas persiste en una base de datos relacional de PostgreSQL en Supabase |
| Sprint 4 | Crear entidades y repositorios para la empresa               | La información de los usuarios persiste en una base de datos relacional de PostgreSQL en Supabase |
| Sprint 4 | Crear entidades y repositorios para la empresa               | La información de los movimientos persiste en una base de datos relacional de PostgreSQL en Supabase |
| Sprint 4 | Crear una interfaz para visualizar todos los movimientos de dinero de una empresa | Es posible visualizar una lista de los movimientos de dinero de la empresa y un total de todos los movimientos |
| Sprint 4 | Crear una interfaz para que los usuarios puedan agregar un movimiento de dinero | Es posible para un usuario agregar un movimiento de dinero   |
| Sprint 4 | Agregar autenticación                                        | El sistema está protegido por login                          |
| Sprint 4 | Desplegar la interfaz                                        | Es posible acceder a la interfaz a través de internet        |



















