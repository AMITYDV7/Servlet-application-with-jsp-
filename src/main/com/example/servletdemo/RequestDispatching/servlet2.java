package RequestDispatching;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/2ndServlet")
public class servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Control of second servlet");
        HttpSession session = req.getSession(false);
        String name= session.getAttribute("name").toString();
          PrintWriter pw2=res.getWriter();
          pw2.println("<h1>This response is from 2nd Servlet<h1>");
    }
}
