import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class ProductNameEdit extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        String idStr = req.getParameter("id");
        String newName = req.getParameter("productName");
        
        ProductData product = ProductData.getProduct(connection, idStr);
        product.productName = newName;
        int n = ProductData.updateProduct(connection, product);
        ProductData p = ProductData.getProduct(connection, idStr);
        res.sendRedirect("ProductList?id=" + p.categoryId);
    }
}