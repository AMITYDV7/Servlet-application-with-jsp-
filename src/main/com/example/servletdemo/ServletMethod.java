import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/ServletMethod")
public class ServletMethod extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("Username");
        String city = req.getParameter("City");
        PrintWriter pw = resp.getWriter();
        if(name.equals("Amit") && city.equals("Jhajjar")){

            resp.sendRedirect("response.html");
        }
        else{
            pw.println("Not login sorry");
        }


    }
}
