## #CRUD operations using play Framework with Slick in Scala !!!

This is a Simple project of Crud operations in Scala using Play framework with Slick and  MySQL database.

## Prerequisites

* sbt version = 1.5.5
* scala version = 2.13.8
* java version= 11.0.14.1
* play framework version = 2.8.15

## Creating a New Project with Play

 After the Installation of [sbt](https://www.scala-sbt.org/1.x/docs/Setup.html). which gives you a proper structure for the 

 >`-> To install play and Sample project`
>  `-> sbt new playframework/play-scala-seed.g8`

After running the command and respond to the prompts to create a play project 

>`-> name [Project Name]: play-scala-seed`
> `-> organization [org Name]:com.qbrainx`
> `-> play_version [2.8.15]: 2.8.15`
>`-> scala_version [2.13.8]: 2.13.8`

A new folder is created named `playproject` that contains the minimal project template contents.

1.  Enter  `sbt run`  to start the server in  the system.
2.  In a browser, enter  [http://localhost:9000](http://localhost:9000/)  to view the welcome page.

Run the following command and respond to the prompts to create a new project template.
>`name [Project Name]: play-scala-seed`
> `organization [org Name]: com.qbrainx`

A new folder is created named `sampleproject` that contains the minimal project template contents.

## 1 . Adding Dependencies

Here, the following dependencies for the project `build.sbt`.

- `libraryDependencies += "com.typesafe.play" %% "play-slick" % "5.0.0"`
- `libraryDependencies += "com.typesafe.play" %% "play-slick-evolutions" % "5.0.0"`
- `libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.28"`

## 2 . plugins.sbt

`addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.14")`

## 3. application.conf

`slick.dbs.default.profile = "slick.jdbc.MySQLProfile$"`  
`slick.dbs.default.db.driver = "com.mysql.cj.jdbc.Driver"`  
`slick.dbs.default.db.url = "jdbc:mysql://localhost/playSlick"`
`slick.dbs.default.db.user ="" `
`slick.dbs.default.db.password = "" `
