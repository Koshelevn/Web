import Servlets.AllRequestServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


public class Main {
    public static void main(String[] args) throws Exception {
        AllRequestServlet frontend = new AllRequestServlet();
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(frontend), "/*");
        Server server = new Server(8080);
        server.setHandler(context);
        server.start();
        server.join();
    }
}
