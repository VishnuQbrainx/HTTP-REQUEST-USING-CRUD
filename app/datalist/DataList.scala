package datalist


import dbconnectivity.DataTable
import models.Data
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile

import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}
import slick.jdbc.MySQLProfile.api._



class DataList @Inject()(protected val dbConfigProvider: DatabaseConfigProvider)(implicit executionContext: ExecutionContext)
  extends HasDatabaseConfigProvider[JdbcProfile] {

  val dataList = TableQuery[DataTable]

  def add(todoItem: Data): Future[String] = {
    dbConfig.db
      .run(dataList += todoItem)
      .map(res => "TodoItem successfully added")
      .recover {
        case ex: Exception => {
          printf(ex.getMessage())
          ex.getMessage
        }
      }
  }

  def delete(id: String): Future[Int] = {
    dbConfig.db.run(dataList.filter(_.id === id).delete)
  }

  def update(todoItem: Data): Future[Int] = {
    dbConfig.db
      .run(dataList.filter(_.id === todoItem.id)
        .map(x => (x.name, x.isComplete))
        .update(todoItem.name, todoItem.isComplete)
      )
  }

  def get(id: String): Future[Option[Data]] = {
    dbConfig.db.run(dataList.filter(_.id === id).result.headOption)
  }

  def listAll: Future[Seq[Data]] = {
    dbConfig.db.run(dataList.result)
  }
}
