plugins {
    id("java")
}

group = "br.com.teste.cadastroUsuarios"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(project(path = ":core"))
    implementation(project(path = ":usecases"))
    implementation(project(path = ":application"))
    implementation(project(path = ":controller"))
}

tasks.test {
    useJUnitPlatform()
}