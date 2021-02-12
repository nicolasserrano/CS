import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class InsertPopulation extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        String id = req.getParameter("id");
        String population = req.getParameter("population");
        toClient.println(Utils.header("Update population"));
        toClient.println("<h3 align='center'>Update population of country: " + id + "</h3>");
        toClient.println("<h3 align='center'>to new population : " + population + "</h3>");
        toClient.println(Utils.footer("Update population"));
        toClient.close();
    }
}