import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class E1 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String sizeStr = request.getParameter("size");
        System.out.println("Size: " + sizeStr);
        String salida = FormHTML.salidaHTML(sizeStr);
        out.println(salida);
    }
}