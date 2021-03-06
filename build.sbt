name := """jwt-play-authentication-demo"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "com.jason-goodwin" % "authentikat-jwt_2.11" % "0.4.5",
  "net.codingwell" %% "scala-guice" % "4.0.0",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  specs2 % Test
)

