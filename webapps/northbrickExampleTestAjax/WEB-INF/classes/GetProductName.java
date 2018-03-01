import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class GetProductName extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        String productId = req.getParameter("code");
        String productJson = req.getParameter("json");

        if (productJson != null) {
            ProductData productData = ProductData.getProduct(connection, productId);
            toClient.print("{");
            toClient.print("\"productId\":\"" + productData.productId + "\"");
            toClient.print(",\"productName\":\"" + productData.productName + "\"");
            toClient.print(",\"unitPrice\":\"" + productData.unitPrice + "\"");
            toClient.print("}");
        } else {
            String productName = ProductData.getProductName(connection, productId);
            toClient.println(productName);
        }
        toClient.close();
    }
}