import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ProductOrderEditMockup extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Product order Form"));
        toClient.println("<form action='ProductOrderUpdate' method='GET'>");
        
        toClient.println("<table border='1'>");
        String idStr = req.getParameter("id");
        ProductOrdersData productOrder = ProductOrdersData.getProduct(Integer.parseInt(idStr));
        toClient.println("<tr><td>Id</td>");
        toClient.println("<td><input name='productId' value='" + productOrder.orderId + "'></td></tr>");
        toClient.println("<tr><td>Name</td>");
        String name = productOrder.customerName;
        toClient.println("<td><input name='customerName' value='" + name + "'></td></tr>");
        toClient.println("</table>");
        toClient.println("<input type='submit'>");

        toClient.println("</form>");
        toClient.println(Utils.footer("Product Form"));
        toClient.close();
    }
}
