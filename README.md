# 🚀 Sistema de Gestión de Tareas con Roles y Seguridad

---

Una aplicación backend en Java inspirada en herramientas como Trello o Asana. Permite gestionar proyectos, tareas y usuarios con distintos roles, aplicando conceptos modernos de Java y buenas prácticas de diseño orientado a objetos.

---

## 📌 Objetivos del Proyecto

- Aplicar fundamentos de POO y diseño UML en un sistema real.
- Utilizar características modernas de Java (Records, Sealed Classes, Pattern Matching, Virtual Threads).
- Practicar colecciones, programación funcional y pruebas unitarias.
- Simular concurrencia y roles de usuario en la gestión de tareas.
- Explorar arquitectura modular y buenas prácticas de backend.

---

## 🧠 Conceptos Técnicos Aplicados

- **POO**: Clases, herencia, polimorfismo, encapsulamiento, abstracción.
- **UML → Código Java**: Composición, agregación, asociaciones bidireccionales.
- **Interfaces y abstracción**: Servicios desacoplados para lógica de negocio.
- **Colecciones y Streams**: Filtrado, agrupamiento y transformación de datos.
- **Programación Funcional**: Uso de `Predicate`, `Function`, `Consumer`, `Optional`.
- **Java Moderno**: Records, Sealed Classes, Pattern Matching, Virtual Threads.
- **Pruebas Unitarias**: Validación de lógica con JUnit 5.
- **Maven + Lombok**: Gestión de dependencias y reducción de boilerplate.

---

## 🧱 Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com.tareas/
│   │       ├── modelo/
│   │       ├── servicio/
│   │       ├── util/
│   │       └── app/
│   └── resources/
└── test/
    └── java/
        └── com.tareas/

```

---

## 🧪 Pruebas

- Validación de roles y permisos.
- Asignación de tareas a usuarios.
- Filtrado por estado, prioridad y fecha.
- Simulación de múltiples usuarios con Virtual Threads.

---

## 🛠️ Tecnologías Utilizadas

- **Java 21**
- **Maven**
- **Lombok**
- **JUnit 5**
- *(Opcional)* Spring Boot + H2/PostgreSQL para persistencia y API REST

---

## 📈 Posibles Extensiones

- Persistencia con base de datos relacional.
- API REST para integración con frontend.
- Autenticación y autorización básica.
- Interfaz gráfica con JavaFX o cliente web.

---

## 📚 Requisitos Previos

- Conocimiento intermedio de Java y POO.
- Familiaridad con Maven y JUnit.
- Experiencia básica en diseño UML y colecciones.