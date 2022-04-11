// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:13
package controllers.api {

  // @LINE:13
  class ReverseDataController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def getAll: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/datar")
    }
  
  }

  // @LINE:16
  class ReverseDataMainController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def getAll: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/data")
    }
  
    // @LINE:18
    def add: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/data/add")
    }
  
    // @LINE:17
    def getById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/data/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:20
    def delete(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/data/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:19
    def update(id:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/data/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}
