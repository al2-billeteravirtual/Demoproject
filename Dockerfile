# Usar una imagen base de Maven para compilar la aplicación
FROM maven:3.9.7-sapmachine-21 AS build

# Copiar el código fuente de la aplicación al contenedor
COPY . /app
WORKDIR /app

# Compilar la aplicación usando Maven
RUN mvn clean package -DskipTests

# Usar una imagen base de Java para ejecutar la aplicación
FROM sapmachine:21.0.3-jre-ubuntu-20.04

# Copiar el archivo JAR compilado de la aplicación al contenedor
COPY --from=build /app/target/*.jar /app.jar

# Exponer el puerto en el que la aplicación se ejecuta
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]