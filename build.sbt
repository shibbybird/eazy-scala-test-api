lazy val akkaHttpVersion = "10.1.10"
lazy val akkaVersion    = "2.5.23"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.eazyci",
      scalaVersion    := "2.12.8"
    )),
    name := "eazy-scala-test-api",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml"        % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream"          % akkaVersion,

      "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % Test,
      "com.typesafe.akka" %% "akka-testkit"         % akkaVersion     % Test,
      "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion     % Test,
      "org.scalatest"     %% "scalatest"            % "3.0.5"         % Test
    )
  )

mainClass := Some("com.eazyci.scala.test.api.Main")

assemblyJarName in assembly := "eazy-scala-test-api.jar"

