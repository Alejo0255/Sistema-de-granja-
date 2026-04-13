# 🐄 Sistema de Gestión de Granja

## 📌 Descripción del Proyecto

El **Sistema de Gestión de Granja** es una aplicación desarrollada en Java que permite administrar usuarios y animales dentro de una granja. El sistema incluye funcionalidades básicas como autenticación (login), registro de usuarios y gestión inicial de animales, utilizando una base de datos MySQL/MariaDB para almacenar la información.

Este proyecto fue desarrollado aplicando la metodología ágil Scrum, organizando el trabajo en Sprints y utilizando herramientas de gestión y control de versiones.

---

## 🎯 Objetivo

Desarrollar un sistema que permita gestionar de forma sencilla y organizada los procesos básicos de una granja, garantizando control de acceso, almacenamiento de datos y facilidad de uso.

---

## ⚙️ Tecnologías Utilizadas

* ☕ Java (Swing para interfaz gráfica)
* 🐬 MySQL / MariaDB
* 🧩 JDBC (Conexión a base de datos)
* 💻 Visual Studio Code
* 🔗 Git y GitHub

---

## 🧩 Funcionalidades Implementadas

### 🔐 Módulo de Autenticación

* Login de usuario
* Validación contra base de datos
* Mensajes de acceso correcto/incorrecto

### 👤 Módulo de Registro

* Registro de nuevos usuarios
* Almacenamiento en base de datos

### 🐄 Módulo de Animales

* Estructura básica de clase Animal
* Preparación para registro y gestión

### 🔌 Conexión a Base de Datos

* Clase `Conexion.java`
* Uso de JDBC para conexión con MySQL/MariaDB

---

## 🗂️ Estructura del Proyecto

```
src/
│
├── conexion/
│   └── Conexion.java
│
├── login/
│   ├── Login.java
│   └── Registro.java
│
├── menu/
│   └── MenuPrincipal.java
│
├── animales/
│   └── Animal.java
│
└── main/
    └── Main.java
```

---

## 🗄️ Base de Datos

### 📌 Crear base de datos:

```sql
CREATE DATABASE granja;
USE granja;
```

### 📌 Tabla usuarios:

```sql
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(50),
    contraseña VARCHAR(50)
);
```

---

## ▶️ Ejecución del Proyecto

1. Clonar repositorio:

```
git clone https://github.com/tu-usuario/sistema-granja.git
```

2. Abrir en VS Code

3. Agregar driver MySQL (`mysql-connector-j`) en carpeta `lib`

4. Configurar conexión en `Conexion.java`

5. Ejecutar clase principal:

```
main.Main
```

---

## ⚠️ Problemas Solucionados

* Error de conexión a base de datos (NullPointerException)
* Error de entorno gráfico (HeadlessException en Linux)
* Problemas con paquetes y estructura del proyecto
* Validación de login

---

## 📊 Metodología de Desarrollo

Se utilizó Scrum con los siguientes Sprints:

### 🔹 Sprint 1

* Configuración del proyecto
* Conexión a base de datos

### 🔹 Sprint 2

* Login funcional
* Registro de usuario

### 🔹 Sprint 3

* Estructura módulo animales

---

## 📈 Métricas Aplicadas

* ✔ Puntos de Función
* ✔ Densidad de Defectos
* ✔ Productividad del Desarrollo

---

## 👥 Equipo de Desarrollo

* Diego Rodríguez
* (Agregar compañeros si aplica)

---

## 🔗 Repositorio

👉 (Pega aquí tu link real de GitHub)

---

## 🚀 Estado del Proyecto

🟡 En desarrollo

---

## 📌 Próximas Mejoras

* CRUD completo de animales
* Mejorar interfaz gráfica
* Validaciones más robustas
* Implementar reportes

---

## 📄 Licencia

Este proyecto es de uso académico.

---




