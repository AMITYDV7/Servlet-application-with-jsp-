import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/ServletMethod") // adding action tag from our html page to link our application to servlet
public class ServletMethod extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("Username");  //req because we can taking req/input from user so we have to store this in variable too
        String city = req.getParameter("City");
        PrintWriter pw = resp.getWriter(); // if we want to send some text format to the client we have to use printerwriter object
        if(name.equals("Amit") && city.equals("India")){
            //This is the condition we can put for make our application dynamic as user will get output based on there input

            resp.sendRedirect("response.html");
        }
        else{
            //we can add another html or jsp page link to else statement
            pw.println("Not login sorry");
        }


    }
}
