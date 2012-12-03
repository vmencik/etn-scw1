name := "etn-scw1"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq (
	"junit" % "junit" % "4.10" % "test",
	"org.scalatest" %% "scalatest" % "1.8" % "test"
)

retrieveManaged := true

EclipseKeys.relativizeLibs := true

