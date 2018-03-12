import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class ProductList extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        String categoryId = req.getParameter("id");
        HttpSession session = req.getSession(false);
        String login = null;
        if (session != null) {
            login = (String)session.getAttribute("login");
            System.out.println("ProductList logged");
            System.out.println("ProductList login: " + login);
        }
        toClient.println(Utils.header("Products"));
        toClient.println("<table border='1'>");
        Vector<ProductData> productList;
        if (categoryId != null) {
            productList = ProductData.getCategoryProductList(connection, categoryId);
        } else {
            productList = ProductData.getProductList(connection);
        }
        for(int i=0; i< productList.size(); i++){
                ProductData product = productList.elementAt(i);
                toClient.println("<tr>");
                toClient.println("<td>" + product.productId + " </td>");
                toClient.println("<td>" + product.productName + " </td>");
                toClient.println("<td>" + product.companyName + " </td>");
                toClient.println("<td>" + product.unitPrice + " </td>");
                if (login != null) {
                    toClient.println("<td><a href='ProductEdit?id=" + product.productId + "'>Edit</a></td>");
                }
                if (categoryId != null) {
                    toClient.println("<td><img style='height:150px;' src='http://northbrick1.appspot.com/images/" + product.productId + ".png'></td>");
                }
                toClient.println("</tr>");
        }

        toClient.println("</table>");
        toClient.println(Utils.footer("Products"));
        toClient.close();
    }
}