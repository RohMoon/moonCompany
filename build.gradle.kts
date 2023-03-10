plugins {
    java
    id("org.springframework.boot") version "3.0.1"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "com"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_19

repositories {
    mavenCentral()
}

dependencies {
//    implementation("org.springframework.boot:spring-boot-starter")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")

    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("org.springframework.boot:spring-boot-starter-security")

    ///////////////////////////////////////////////////////////////////////
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.boot:spring-boot-starter-websocket")
    ///////////////////////////////////////////////////////////////////////

    compileOnly ("org.projectlombok:lombok")
    developmentOnly ("org.springframework.boot:spring-boot-devtools")
    runtimeOnly ("org.mariadb.jdbc:mariadb-java-client")
    annotationProcessor ("org.projectlombok:lombok")
//    providedRuntime ("org.springframework.boot:spring-boot-starter-tomcat")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
    testImplementation ("org.springframework.security:spring-security-test")

    implementation ("com.querydsl:querydsl-jpa")
    implementation ("com.h2database:h2")
    // https://mvnrepository.com/artifact/net.coobird/thumbnailator
}

tasks.withType<Test> {
    useJUnitPlatform()
}
