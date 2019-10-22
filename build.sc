import mill._, scalalib._

object foo extends ScalaModule {

  def scalaVersion = "2.12.10"

  def scalacOptions = Seq("-Xfatal-warnings", "-Ywarn-unused")
}
