import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S2 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String val = request.getParameter("products");
        System.out.println("products: " + val);
        int valInt = Integer.parseInt(val);
        String [] values = new String[valInt];
        for (int i=0; i<valInt; i++) {
            values[i] = request.getParameter("P" + i);
        }
        String html = C2.printProducts(values);
        out.println(html);
    }
}