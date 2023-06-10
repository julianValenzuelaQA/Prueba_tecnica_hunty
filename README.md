# PruebaTecnica
[Repositorio de Azure DevOps](https://dev.azure.com/jvalendev/_git/Prueba%20Tecnica%20Hunty)

Este proyecto es una prueba técnica de Hunty, en la que se realiza la automatización de la página web [Swag Labs](https://www.saucedemo.com/v1/index.html.) Se utiliza Java como lenguaje de programación, Selenium y Serenity como frameworks de automatización y IntelliJ IDEA como IDE.

# Requisitos
Para ejecutar este proyecto se necesita:

IntelliJ IDEA
- Java 8 o superior, se usara el que Intellij idea trae integrado
- Gradle 7.4, se usara el que Intellij idea trae integrado
- El navegador web Chrome version 114.

# Instalación
Para instalar este proyecto se debe:

- Clonar el repositorio de Azure DevOps
- Abrir el proyecto con IntelliJ IDEA
- Ejecutar el comando gradle clean test para compilar el código y ejecutar las pruebas

# Uso
Este proyecto realiza las siguientes pruebas automatizadas:

- Iniciar sesión con un usuario válido
- Añadir productos al carrito de compras
- Completar el proceso de compra
- Cerrar sesión

Los resultados de las pruebas se pueden ver en el reporte generado por Serenity en la carpeta target/site/serenity.

# Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.

# Créditos
Este proyecto ha sido desarrollado por Julian Valenzuela como parte de la prueba técnica de Hunty.
