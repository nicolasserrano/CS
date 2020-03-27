import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormResponse extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<H1>Form response</H1>");
        String nombreStr = request.getParameter("nombre");
        String contrasenaStr = request.getParameter("contrasena");
        out.println("<P>Nombre: " + nombreStr + "</P>");
        out.println("<P>Contrase&ntilde;a: " + contrasenaStr + "</P>");
    }
}