# Challenge-Alura-Back-End-FORO HUB
📚 Índice
1. Descripción del Proyecto
2. Funcionalidades Principales
3. Estado del Proyecto
4. Tecnologías Utilizadas
5. Personas Desarrolladoras del Proyecto


# 1. Descripción del Proyecto:
Este proyecto es un foro desarrollado como parte del desafío final para completar la especialización en desarrollo BACK-END, culminando un intenso período de 7 meses de estudio. El foro permite la gestión de tópicos mediante operaciones CRUD básicas (POST, GET, DELETE y PUT) y utiliza JWT (JSON Web Token) para la autenticación y autorización de usuarios. La aplicación está organizada en paquetes bien definidos como Controladores, Modelos y Seguridad para mantener una estructura de código limpia y manejable.

# 2. Funcionalidades Principales:
        •	Autenticación y Generación de JWT:
                - Los usuarios deben estar registrados en la base de datos.
                - Para obtener el JWT, el usuario debe autenticarse con las credenciales correctas.
        •	Registro de Tópicos:
                - Para crear un nuevo tópico, envía una solicitud POST con los campos necesarios excepto el ID, ya que se genera automáticamente.
        •	Eliminación de Tópicos:
                - Para eliminar un tópico, realiza una solicitud DELETE con el ID del tópico en la URL.
        •	Actualización de Tópicos:
                - Para actualizar un tópico, proporciona el ID y los campos a modificar en una solicitud PUT.
        •	Listado de Tópicos:
                - No hay limitaciones en el listado de tópicos; todos los tópicos se muestran en la respuesta.

# 3. Estado del Proyecto:
🚀 Finalizado - El proyecto está completo y funcional. Se ha implementado un manejo exhaustivo de excepciones con mensajes claros para facilitar la identificación de errores por parte de los usuarios. Además, se asegura de devolver códigos de estado HTTP apropiados como 200 OK, 204 No Content, etc.

# 4. Tecnologías Utilizadas:
- Java
- Spring Boot
- JWT (JSON Web Token)
- MySQL
- Insomnia (para pruebas de API)
- JSON
- Flyway (para migraciones de base de datos)

# 5. Personas Desarrolladoras del Proyecto:
👨‍💻 Daniel Carrasco Santos






