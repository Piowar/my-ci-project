# ETAP 1: Budowanie aplikacji (Maven + JDK 17)
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Kopiujemy plik konfiguracyjny Mavena
COPY pom.xml .

# Kopiujemy kod źródłowy
COPY src ./src

# Budujemy paczkę JAR (pomijamy testy, bo zrobi je GitHub Actions)
RUN mvn clean package -DskipTests

# ETAP 2: Uruchamianie (tylko niezbędne środowisko JRE)
FROM openjdk:17-jdk-slim
WORKDIR /app

# Kopiujemy tylko gotowy plik JAR z poprzedniego etapu
# Zwróć uwagę na nazwę: my-ci-app-1.0-SNAPSHOT.jar (zgodnie z Twoim pom.xml)
COPY --from=build /app/target/my-ci-app-1.0-SNAPSHOT.jar app.jar

# Informujemy, na którym porcie działa aplikacja (standardowo 8080)
EXPOSE 8080

# Komenda startowa
ENTRYPOINT ["java", "-jar", "app.jar"]
