import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistroUsuario extends HttpServlet {
    public static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
     
        HttpSession session = req.getSession(true);
        
        String name = req.getParameter("usuario");
        session.setAttribute("user", name);
    
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        
        toClient.println("<html>");
        toClient.println("<title>Registro usuario</title>");
        toClient.println("<body>");
        toClient.println("<H2>Registro de " + name + " con sesion: " + session.getId() + "</H2>");
        toClient.println("<BR><a href=\"menu.html\">Ir al menu</a>");
        toClient.println("</body>");
        toClient.println("</html>");
        toClient.close();
    }
}