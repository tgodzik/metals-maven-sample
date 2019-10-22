import mill._, scalalib._
import $ivy.`com.lihaoyi::mill-contrib-bloop:0.4.0`

object foo extends ScalaModule {
  
  def scalaVersion = "2.12.8"

  def scalacOptions = Seq("-Xfatal-warnings", "-Ywarn-unused")
}
