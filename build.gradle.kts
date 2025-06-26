plugins { java }

allprojects {
    group = "com.example"
    version = "1.0.0"

    repositories { mavenCentral() }
}

subprojects {
    apply(plugin = "java")

    java { toolchain { languageVersion.set(JavaLanguageVersion.of(24)) } }
}
