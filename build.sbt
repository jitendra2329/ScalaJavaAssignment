ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "scala-java-project"
  )


lazy val javaProject = project.settings(
  name := "java-project"
)
lazy val scalaProject = project.settings(
  name := "scala-project"
).dependsOn(javaProject)
