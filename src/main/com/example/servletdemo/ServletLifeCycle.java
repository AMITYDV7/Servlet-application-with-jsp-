import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ServletLife")
public class ServletLifeCycle extends HttpServlet {

    static{
        System.out.println("Servlet is loaded");
    }

    public ServletLifeCycle(){
        System.out.println("object is created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("this is init method");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Service method to handle http request by client ");
    }
    @Override
    public void destroy() {

    }
}
