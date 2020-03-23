import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DatosCeldas extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        String filasStr = req.getParameter("filas");
        String columnasStr = req.getParameter("columnas");
        int filas = Integer.parseInt(filasStr);
        int columnas = Integer.parseInt(columnasStr);
        toClient.println("<html>");
        toClient.println("<title>Datos del panel</title>");
        toClient.println("<body>");
        toClient.print("<form action=\"Calculo\" method=\"POST\" target=\"Calculos\">");
        toClient.print("<INPUT TYPE=\"text\" readonly NAME=\"filas\" value=\""
          + filasStr + "\">");
        toClient.print("<INPUT TYPE=\"text\" readonly NAME=\"columnas\" value=\""
          + columnasStr + "\">");
        toClient.println("<table border='1'>");
        int k = 0;
        for (int i = 0;i < filas ; i++) {
            toClient.print("<TR>");
            for (int j = 0;j < columnas ; j++) {
                toClient.print("<TD> <INPUT TYPE=\"text\" SIZE=\"3\" NAME=\"celda" + k + "\">" + "</TD>");
                k++;
            }
            toClient.print("</TR>");
        }
        toClient.println("</table>");
        toClient.println("<input type=\"submit\"  value= \"Calcular\"  >");
        toClient.println("</form>");
        toClient.println("</body>");
        toClient.println("</html>");
        toClient.close();
    }
}