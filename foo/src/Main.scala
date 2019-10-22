object Main extends App {

  val formatted = """|
                     |
                     |def crossSetting[A](
                     |    scalaVersion: String,
                     |    if211: List[A],
                     |    otherwise: List[A] = Nil
                     |): List[A] =
                     |  CrossVersion.partialVersion(scalaVersion) match {
                     |    case Some((2, 11)) => if211
                     |    case _ => otherwise
                     |  }
                     |
                     |
                     |""".stripMargin
}
