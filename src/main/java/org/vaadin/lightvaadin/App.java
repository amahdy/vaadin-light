package org.vaadin.lightvaadin;

import com.vaadin.server.VaadinServlet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/** Minimal Servlet bootstrap for Vaadin application.
 *
 * @author Sami Ekblad
 */
public class App {

    public static void main(String[] args) {
        Server server = new Server(8080);

        ServletContextHandler contextHandler
                = new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.setContextPath("/");

        ServletHolder sh = new ServletHolder(new VaadinServlet());
        contextHandler.addServlet(sh, "/*");
        contextHandler.setInitParameter("ui", MyUI.class.getCanonicalName());
        // Set other init params like Vaadin productionMode 
        contextHandler.setInitParameter("productionMode", "true");

        server.setHandler(contextHandler);

        try {
            server.start();
            server.join();

        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
