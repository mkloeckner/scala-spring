
lazy val springcore = "org.springframework" % "spring-core" % "3.2.16.RELEASE"

lazy val springcontext = "org.springframework" % "spring-context" % "3.2.16.RELEASE"

lazy val cglib = "cglib" % "cglib" % "2.2.2"


lazy val commonSettings = Seq(
  organization := "org.kloeckner.org",
  version := "1.0",
  scalaVersion := "2.11.8"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "scala-spring",
    libraryDependencies ++= Seq(springcore, springcontext)
  )



