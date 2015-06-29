package fr.jetoile.sample;

import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.ext.jaxrs.JaxRsApplication;

/**
 * Created by khanh on 29/06/15.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.setProperty("org.restlet.engine.loggerFacadeClass", "org.restlet.ext.slf4j.Slf4jLoggerFacade");


        Component server = new Component();
        Server s = server.getServers().add(Protocol.HTTP, 8081);

        JaxRsApplication app = new JaxRsApplication(server.getContext().createChildContext());
        app.add(new SimpleApplication());
        server.getDefaultHost().attach(app);
        server.start();
    }
}
