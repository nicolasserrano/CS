import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import Jama.*;

public class Borrar extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                                          throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String strMatrix1 = request.getParameter("matrix1");
        int im1 = Integer.parseInt(strMatrix1);

        Matrix m1 = MatrixVector.v.remove(im1);
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Determinante de matriz</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"#FFFFFF\" text=\"#631818\">");
        out.println("<p align=\"center\"><font size=\"6\"><b>RESULTADO</b></font></p>");

        out.println("<p align=\"center\">");
        out.println("Eliminada matriz ");
        out.println(MatrixVector.printMatrix(m1));
        out.println("<BR><a href=\"menu.html\">Ir al men&uacute;</a>");
        out.println("</body>");
        out.println("</html>");
    }

}
