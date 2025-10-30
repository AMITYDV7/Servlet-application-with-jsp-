package RequestDispatching;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/1stServlet")
public class servlet1 extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("This line belong to first servlet");
    RequestDispatcher reqDispatch=req.getRequestDispatcher("/2ndServlet"); //used to dispatch the response from servlet
    //reqDispatch.forward(req,res); // this forward method is used when we want forward our response to other servlet
        reqDispatch.include(req, res);
        PrintWriter pw = res.getWriter();
        pw.println("<h1>This response is from 1st servlet<h1>");
        pw.close();
    }
}
