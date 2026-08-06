# Estágio 1: Build da aplicação com Maven
# Usamos uma imagem base que já contém o Maven e o JDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o pom.xml para o contêiner para baixar as dependências
COPY pom.xml .

# Copia o código-fonte da aplicação
COPY src ./src

# Executa o build do Maven. O -DskipTests pula a execução dos testes para acelerar o build.
RUN mvn clean package -DskipTests


# Estágio 2: Execução da aplicação
# Usamos uma imagem base slim do OpenJDK 21, que é menor e mais segura
FROM eclipse-temurin:21-jre-jammy

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo .jar gerado no estágio de build para o contêiner final
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta 8080, que é a porta padrão do Spring Boot
EXPOSE 8080

# Comando para executar a aplicação quando o contêiner iniciar
ENTRYPOINT ["java", "-jar", "app.jar"]