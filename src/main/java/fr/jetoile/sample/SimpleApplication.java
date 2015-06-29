package fr.jetoile.sample;

import fr.jetoile.sample.service.SimpleService;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class SimpleApplication extends Application {
   public Set<Class<?>> getClasses() {
      Set<Class<?>> rrcs = new HashSet<Class<?>>();
      rrcs.add(SimpleService.class);
      return rrcs;
   }
}
