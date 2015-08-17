name := "rgraph"

scalaVersion := "2.11.6"

exportJars := true

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

libraryDependencies ++= Seq(
  "com.github.dk14"              %  "rflows_2.11"                   % "0.2-SNAPSHOT"
)

organization := "com.github.andremccarv"

