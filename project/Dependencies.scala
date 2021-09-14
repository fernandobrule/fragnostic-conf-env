import sbt._
import Keys._

object Dependencies {
  
  lazy val logbackClassic      = "ch.qos.logback" % "logback-classic"            % "1.2.3" % "runtime"
  lazy val slf4jApi            = "org.slf4j"      % "slf4j-api"                  % "1.7.25"
  lazy val scalatest           = "org.scalatest" %% "scalatest"                  % "3.2.2"

  lazy val fragnosticI18nImpl = "com.fragnostic" % "fragnostic-i18n-impl_2.13" % "0.2.3"
  lazy val fragnosticConfBase = "com.fragnostic" % "fragnostic-conf-base_2.13" % "0.1.5"

}
