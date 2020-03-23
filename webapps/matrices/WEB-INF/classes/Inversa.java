import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import Jama.*;

public class Inversa extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                                          throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String strMatrix1 = request.getParameter("matrix1");
        int im1 = Integer.parseInt(strMatrix1);

        Matrix m1 = MatrixVector.v.elementAt(im1);
        Matrix m = m1.inverse();
        MatrixVector.v.addElement(m);
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Matriz inversa</title>");
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
