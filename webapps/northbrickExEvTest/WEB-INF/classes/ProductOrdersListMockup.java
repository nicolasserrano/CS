import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ProductOrdersListMockup extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Orders"));
        toClient.println("<h2>Developed by your name, card id: your card id</h2>");
        toClient.println("<table id='ordersTable' border='1'>");
        Vector<ProductOrdersData> productOrdersList = ProductOrdersData.getProductOrdersList();
        for(int i=0; i< productOrdersList.size(); i++){
            ProductOrdersData productOrder = productOrdersList.elementAt(i);
            toClient.println("<tr>");
            toClient.println("<td>" + productOrder.orderId + " </td>");
            toClient.println("<td>" + productOrder.customerId + " </td>");
            toClient.println("<td>" + productOrder.customerName + " </td>");
            toClient.println("<td>" + productOrder.quantity + " </td>");
            toClient.println("<td><a href='ProductOrderEditMockup?id=" + (i + 1) + "'>Edit</a></td>");
            toClient.println("</tr>");
        }

        toClient.println("</table>");
        toClient.println("<script src='productOrdersList.js'></script>");
        toClient.println(Utils.footer("Orders"));
        toClient.close();
    }
}