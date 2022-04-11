package controllers.api

import dataform.DataForm
import models.Data
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}
import service.TodoService

import scala.concurrent.ExecutionContext.Implicits.global
import javax.inject.Inject
import scala.concurrent.Future

class DataMainController @Inject()(
                                    cc: ControllerComponents,
                                    todoService: TodoService
                                  ) extends AbstractController(cc) {

  import play.api.mvc.ControllerComponents

  implicit val todoFormat = Json.format[Data]

  def getAll() = Action.async { implicit request: Request[AnyContent] =>
    todoService.listAllItems map { items =>
      Ok(Json.toJson(items))
    }
  }

  def getById(id: String) = Action.async { implicit request: Request[AnyContent] =>
    todoService.getItem(id) map { item =>
      Ok(Json.toJson(item))
    }
  }

  def add() = Action.async { implicit request: Request[AnyContent] =>
    DataForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val newTodoItem = Data(data.id,data.name, data.isComplete)
        todoService.addItem(newTodoItem).map(_ => Redirect(routes.DataMainController.getAll))
      })
  }

  def update(id: String) = Action.async { implicit request: Request[AnyContent] =>
    DataForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val todoItem = Data(data.id, data.name, data.isComplete)
        todoService.updateItem(todoItem).map(_ => Redirect(routes.DataMainController.getAll))
      })
  }

  def delete(id: String) = Action.async { implicit request: Request[AnyContent] =>
    todoService.deleteItem(id) map { res =>
      Redirect(routes.DataMainController.getAll)
    }
  }
}
