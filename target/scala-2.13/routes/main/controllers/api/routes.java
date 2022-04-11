// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers.api;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.api.ReverseDataController DataController = new controllers.api.ReverseDataController(RoutesPrefix.byNamePrefix());
  public static final controllers.api.ReverseDataMainController DataMainController = new controllers.api.ReverseDataMainController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.api.javascript.ReverseDataController DataController = new controllers.api.javascript.ReverseDataController(RoutesPrefix.byNamePrefix());
    public static final controllers.api.javascript.ReverseDataMainController DataMainController = new controllers.api.javascript.ReverseDataMainController(RoutesPrefix.byNamePrefix());
  }

}
