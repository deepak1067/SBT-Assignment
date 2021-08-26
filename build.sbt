import  dependencies.{Libraries, PersistenceModuleDependencies, httpModuleDependencies }
import  CommonSetting._
name := "SBT2"

version := "0.1"

scalaVersion := "2.12.12"
lazy val root = project.in(file("."))
  .aggregate(Persistence, http)

lazy val  Persistence= (
  baseProject("Persistence")
    settings(libraryDependencies ++= PersistenceModuleDependencies)
  )

lazy val http = (
  baseProject("http")

    settings(libraryDependencies ++= httpModuleDependencies )


  )