import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S3 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String val = request.getParameter("palabras");
        System.out.println("palabras: " + val);
        int valInt = Integer.parseInt(val);
        String [] values = new String[valInt];
        for (int i=0; i<valInt; i++) {
            values[i] = request.getParameter("palabra_" + i);
        }
        String html = C3.histograma(values);
        out.println(html);
    }
}