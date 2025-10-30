import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Session")
public class Http_Session extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("username");
        String city = req.getParameter("city");

        // create or get existing session
        HttpSession session = req.getSession();
        session.setAttribute("username", name);
        session.setAttribute("city", city);

        session.setMaxInactiveInterval(10000);

        // forward to next servlet
        RequestDispatcher reqDispatch = req.getRequestDispatcher("/2ndServlet");
        reqDispatch.forward(req, res);
    }
}
