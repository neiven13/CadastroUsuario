plugins {
    id("java")
}

group = "br.com.teste.cadastroUsuarios.application"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(project(path = ":core"));
    implementation(project(path = ":usecases"))
    // https://mvnrepository.com/artifact/com.mysql/mysql-connector-j
    implementation("com.mysql:mysql-connector-j:8.1.0")
    implementation("io.github.cdimascio:dotenv-java:3.0.0")
}

tasks.test {
    useJUnitPlatform()
}