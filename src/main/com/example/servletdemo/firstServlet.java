import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
     String name = req.getParameter("username");
     String city = req.getParameter("city");
   PrintWriter pw = resp.getWriter();
        pw.println("<body bgcolor=\"#ffe4c4\">");
        pw.println("<h1>"+name+"</h1>");
        pw.println("<h1>"+city+"</h1>");
        pw.println("</body>");
        pw.close();
    }
}
