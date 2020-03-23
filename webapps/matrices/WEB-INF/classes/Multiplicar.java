import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import Jama.*;

public class Multiplicar extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                                          throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String strMatrix1 = request.getParameter("matrix1");
        int im1 = Integer.parseInt(strMatrix1);
        String strMatrix2 = request.getParameter("matrix2");
        int im2 = Integer.parseInt(strMatrix2);

        Matrix m1 = MatrixVector.v.elementAt(im1);
        Matrix m2 = MatrixVector.v.elementAt(im2);
        Matrix m = m1.times(m2);
        MatrixVector.v.addElement(m);
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Multiplicar matriz</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"#FFFFFF\" text=\"#631818\">");
        out.println("<p align=\"center\"><font size=\"6\"><b>MATRIZ RESULTADO</b></font></p>");

        out.println("<p align=\"center\">");
        out.println(MatrixVector.printMatrix(m));
        out.println("<a href=\"menu.html\">Ir al men&uacute;</a>");
        out.println("</body>");
        out.println("</html>");
    }

}
