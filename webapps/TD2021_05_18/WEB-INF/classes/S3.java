import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S3 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String val = request.getParameter("products");
        System.out.println("products: " + val);
        int valInt = Integer.parseInt(val);
        String [] values = new String[valInt];
        for (int i=0; i<valInt; i++) {
            String[] res = request.getParameterValues("p_" + i);
            if (res != null) {
                int length = res.length;
                values[i] = Integer.toString(length);
            } else {
                values[i] = "0";
            }
        }
        String html = C3.printLines(values);
        out.println(html);
    }
}