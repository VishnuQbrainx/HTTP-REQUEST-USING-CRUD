package controllers.api

import com.sun.tools.javac.comp.Todo
import models.Data
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject.Inject

class DataController @Inject()(
                                cc: ControllerComponents
                              ) extends AbstractController(cc) {

  implicit val todoFormat = Json.format[Data]

  def getAll = Action {
    val data = new Data("1", "item 1", false)
    Ok(Json.toJson(data))
  }

}
