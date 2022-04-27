import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S1 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String val = request.getParameter("products");
        System.out.println("products: " + val);
        int valInt = Integer.parseInt(val);
        String html = C1.createForm(valInt);
        out.println(html);
    }
}