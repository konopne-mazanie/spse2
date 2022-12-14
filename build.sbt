
// The simplest possible sbt build file is just one line:

scalaVersion := "2.13.8"


name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"


libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"

