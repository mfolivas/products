import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "product-add"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
        "net.sf.barcode4j" % "barcode4j" % "2.0"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
