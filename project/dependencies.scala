import sbt.Keys.libraryDependencies
import sbt._
object dependencies {
  object  Version {
    val AkkaVersion = "2.6.15"
    val ScalaTestVersion = "3.2.9"
  }

  object Libraries {
    val slick = "com.typesafe.slick" %% "slick" % "3.3.3"
    val mysqlconnectorjava = "mysql" % "mysql-connector-java" % "5.1.16"
    val scalatest  = "org.scalatest" %% "scalatest" % Version.ScalaTestVersion % Test
    val h2 = "com.h2database" % "h2" % "1.3.148" % Test
    val mockito = "org.mockito" % "mockito-core" % "3.6.0" % Test
    val akkahttp = "com.typesafe.akka" %% "akka-http" % "10.2.6"
    val akkaactor = "com.typesafe.akka" %% "akka-actor" % "2.6.16"
    val akkastream = "com.typesafe.akka" %% "akka-stream" % "2.6.16"
    val akkaactortestkittyped = "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.16" % Test
    val akkastreamtestkit = "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.8" % Test
    val akkahttptestkit = "com.typesafe.akka" %% "akka-http-testkit" % "10.2.6" % Test
  }


  val PersistenceModuleDependencies: Seq[sbt.ModuleID] =
    Seq(Libraries.slick, Libraries.mysqlconnectorjava, Libraries.scalatest,Libraries.h2,Libraries.mockito)
  val httpModuleDependencies: Seq[sbt.ModuleID] =

    Seq(Libraries.akkahttp, Libraries.akkaactor,Libraries.akkastream,  Libraries.akkaactortestkittyped,Libraries.akkastreamtestkit,Libraries.akkahttptestkit)

  }
