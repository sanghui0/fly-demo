# 1단계: Gradle로 build
FROM gradle:8.5-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle clean bootJar --no-daemon

# 2단계: 실행 이미지
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar

# JVM 옵션은 필요에 따라 조절
ENTRYPOINT ["java", "-jar", "app.jar"]
