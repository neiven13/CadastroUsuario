plugins {
    id("java")
}

group = "br.com.teste.cadastroUsuarios.controller"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(project(path = ":core"))
    implementation(project(path = ":application"))
    implementation(project(path = ":usecases"))
}

tasks.test {
    useJUnitPlatform()
}