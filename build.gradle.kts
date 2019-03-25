val kotlinVersion: String by project

plugins {
  application
  kotlin("jvm") version "1.3.21"
}

group = "murmur"
version = "1.0.0"

application {
  repositories {
    mavenLocal()
    jcenter()
  }

  dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
  }
}
