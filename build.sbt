name := """add-tech"""
organization := "bheathcote.com"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

herokuAppName in Compile := "immense-bayou-02971"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "bheathcote.com.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "bheathcote.com.binders._"
