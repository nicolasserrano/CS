import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import Jama.*;

public class DeterminanteSeleccion extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                                          throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Selecci&oacute;n de matriz para calcular determinante</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"#FFFFFF\" text=\"#631818\">");
        out.println("<p align=\"center\"><font size=\"6\"><b>MATRIZ PARA CALCULAR DETERMINANTE</b></font></p>");
        out.println("<p align=\"center\">");
        out.println("<TABLE border=0>");
        out.println("<FORM action=\"Determinante\" method=\"GET\">");
        out.println("<TR>");
        out.println("<TD>");
        out.println(MatrixVector.printMatrices("matrix1"));
        out.println("</TD>");
        out.println("</TR>");
        out.println("</TABLE>");

        out.println("<INPUT type=\"submit\" value=\"Determinante\">");
        out.println("</FORM>");
        out.println("<BR><BR>");
        out.println("<a href=\"menu.html\">Ir al men&uacute;</a>");
        out.println("</body>");
        out.println("</html>");
            

    }

}
