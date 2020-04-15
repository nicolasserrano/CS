import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Count extends HttpServlet{
    static int count = 0;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        count++;
        out.println(count);
    }
}
