package dataform

import play.api.data.Form
import play.api.data.Forms.{boolean, mapping, nonEmptyText}

case class DataForm(id:String,name: String, isComplete: Boolean)

object DataForm {
  val form = Form(
    mapping(
      "id"->nonEmptyText,
      "name" -> nonEmptyText,
      "isComplete" -> boolean
    )(DataForm.apply)(DataForm.unapply)
  )
}
