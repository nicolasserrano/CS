import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class ProductOrders extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        String productid = req.getParameter("productid");
        
        // tengo que traer el nombre del producto para ponerlo en el titulo
        ProductData product = ProductData.getProduct(connection, productid);

        toClient.println(Utils.header("List of Orders of " + product.productName));
        toClient.println("<H3 style='text-align: center;'> Developed by Juanfran, card id: A904161 </H3>");
        toClient.println("<table border='1'>");
        toClient.println("<tr><th>Order Id</th><th>Customer Id</th><th>Customer Name</th><th>Quantity</th></tr>"); //table headers
        
        Vector<ProductOrdersData> productOrders = ProductOrdersData.getProductOrdersList(connection, productid);
       
        for(int i=0; i< productOrders.size(); i++){
                ProductOrdersData order = productOrders.elementAt(i);
                toClient.println("<tr>");
                toClient.println("<td>" + order.orderId + " </td>");
                toClient.println("<td>" + order.customerId + " </td>");
                toClient.println("<td>" + order.customerName + " </td>");
                toClient.println("<td>" + order.quantity + " </td>");
                toClient.println("<td><a href='OrderEdit?id="+order.orderId+"'>Edit</a>");
                toClient.println("</tr>");
        }
        toClient.println("</table>");
        toClient.println(Utils.footer("Products"));
        toClient.close();
    }
}