import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import Jama.*;

public class Determinante extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                                          throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String strMatrix1 = request.getParameter("matrix1");
        int im1 = Integer.parseInt(strMatrix1);

        Matrix m1 = MatrixVector.v.elementAt(im1);
        double val = m1.det();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Determinante de matriz</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"#FFFFFF\" text=\"#631818\">");
        out.println("<p align=\"center\"><font size=\"6\"><b>RESULTADO</b></font></p>");

        out.println("<p align=\"center\">");
        out.println("El determinante de ");
        out.println(MatrixVector.printMatrix(m1));
        out.println(" es: " + val);
        out.println("<BR><a href=\"menu.html\">Ir al men&uacute;</a>");
        out.println("</body>");
        out.println("</html>");
    }

}
