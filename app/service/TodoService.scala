package service

import com.google.inject.Inject
import datalist.DataList
import models.Data

import scala.concurrent.Future

class TodoService @Inject() (items: DataList) {

  def addItem(item: Data): Future[String] = {
    items.add(item)
  }

  def deleteItem(id: String): Future[Int] = {
    items.delete(id)
  }

  def updateItem(item: Data): Future[Int] = {
    items.update(item)
  }

  def getItem(id: String): Future[Option[Data]] = {
    items.get(id)
  }

  def listAllItems: Future[Seq[Data]] = {
    items.listAll
  }
}
