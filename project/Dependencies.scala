import sbt._

object Dependencies {

  lazy val fragnosticI18nImpl      = "com.fragnostic"        % "fragnostic-i18n-impl_2.13" % "0.2.6"
  lazy val fragnosticConfBase      = "com.fragnostic"        % "fragnostic-conf-base_2.13" % "0.1.8"

  lazy val logbackClassic          = "ch.qos.logback"        % "logback-classic"           % "1.5.0" % "runtime"
  lazy val scalatestFunSpec        = "org.scalatest"        %% "scalatest-funspec"         % "3.2.18" % Test
  lazy val slf4jApi                = "org.slf4j"             % "slf4j-api"                 % "2.0.0-alpha5"

}
