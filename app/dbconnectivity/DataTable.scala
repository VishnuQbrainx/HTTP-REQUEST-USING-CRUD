package dbconnectivity


import models.Data
import slick.lifted.Tag
import slick.jdbc.MySQLProfile.api._

class DataTable (tag: Tag) extends Table[Data](tag, "dataexit") {

  def id = column[String]("id")
  def name = column[String]("name")
  def isComplete = column[Boolean]("isComplete")

  override def * = (id, name, isComplete) <> (Data.tupled, Data.unapply)
}
