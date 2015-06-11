enablePlugins(JavaAppPackaging)

name := "akka-http-hello-world"
organization := "mu.node"
version := "0.1"
scalaVersion := "2.11.6"
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")
assemblyJarName in assembly := "akka-http-hello-world.jar"

libraryDependencies ++= {
  val akkaVersion = "2.3.10"
  val akkaStreamVersion = "1.0-RC2"
  //val scalaTestVersion = "2.2.4"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream-experimental" % akkaStreamVersion,
    "com.typesafe.akka" %% "akka-http-core-experimental" % akkaStreamVersion,
    "com.typesafe.akka" %% "akka-http-scala-experimental" % akkaStreamVersion
    //"com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaStreamVersion,
    //"com.typesafe.akka" %% "akka-http-testkit-scala-experimental" % akkaStreamVersion,
    //"org.scalatest" %% "scalatest" % scalaTestVersion % "test"
  )
}

Revolver.settings
