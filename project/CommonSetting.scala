import sbt._

object CommonSetting {

  lazy val projectSettings = Seq(

  )
  def baseProject(name: String): Project = {
    Project(name, file(name))
  }
}