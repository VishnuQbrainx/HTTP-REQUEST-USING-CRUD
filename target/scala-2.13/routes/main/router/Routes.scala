// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:10
  Assets_1: controllers.Assets,
  // @LINE:13
  DataController_2: controllers.api.DataController,
  // @LINE:16
  DataMainController_3: controllers.api.DataMainController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:10
    Assets_1: controllers.Assets,
    // @LINE:13
    DataController_2: controllers.api.DataController,
    // @LINE:16
    DataMainController_3: controllers.api.DataMainController
  ) = this(errorHandler, HomeController_0, Assets_1, DataController_2, DataMainController_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, DataController_2, DataMainController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/datar""", """controllers.api.DataController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/data""", """controllers.api.DataMainController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/data/""" + "$" + """id<[^/]+>""", """controllers.api.DataMainController.getById(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/data/add""", """controllers.api.DataMainController.add"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/data/update/""" + "$" + """id<[^/]+>""", """controllers.api.DataMainController.update(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/data/delete/""" + "$" + """id<[^/]+>""", """controllers.api.DataMainController.delete(id:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_api_DataController_getAll2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/datar")))
  )
  private[this] lazy val controllers_api_DataController_getAll2_invoker = createInvoker(
    DataController_2.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.DataController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """api/datar""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_api_DataMainController_getAll3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/data")))
  )
  private[this] lazy val controllers_api_DataMainController_getAll3_invoker = createInvoker(
    DataMainController_3.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.DataMainController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """api/data""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_api_DataMainController_getById4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/data/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_DataMainController_getById4_invoker = createInvoker(
    DataMainController_3.getById(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.DataMainController",
      "getById",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/data/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_api_DataMainController_add5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/data/add")))
  )
  private[this] lazy val controllers_api_DataMainController_add5_invoker = createInvoker(
    DataMainController_3.add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.DataMainController",
      "add",
      Nil,
      "POST",
      this.prefix + """api/data/add""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_api_DataMainController_update6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/data/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_DataMainController_update6_invoker = createInvoker(
    DataMainController_3.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.DataMainController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """api/data/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_api_DataMainController_delete7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/data/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_DataMainController_delete7_invoker = createInvoker(
    DataMainController_3.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.DataMainController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """api/data/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_api_DataController_getAll2_route(params@_) =>
      call { 
        controllers_api_DataController_getAll2_invoker.call(DataController_2.getAll)
      }
  
    // @LINE:16
    case controllers_api_DataMainController_getAll3_route(params@_) =>
      call { 
        controllers_api_DataMainController_getAll3_invoker.call(DataMainController_3.getAll)
      }
  
    // @LINE:17
    case controllers_api_DataMainController_getById4_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_api_DataMainController_getById4_invoker.call(DataMainController_3.getById(id))
      }
  
    // @LINE:18
    case controllers_api_DataMainController_add5_route(params@_) =>
      call { 
        controllers_api_DataMainController_add5_invoker.call(DataMainController_3.add)
      }
  
    // @LINE:19
    case controllers_api_DataMainController_update6_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_api_DataMainController_update6_invoker.call(DataMainController_3.update(id))
      }
  
    // @LINE:20
    case controllers_api_DataMainController_delete7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_api_DataMainController_delete7_invoker.call(DataMainController_3.delete(id))
      }
  }
}
