plugins { application }

application { mainClass.set("SimpleIJ") }

dependencies { implementation(project(":SimpleDBEngine")) }

tasks.named<JavaExec>("run") {
      standardInput = System.`in`
}
