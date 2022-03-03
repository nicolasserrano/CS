import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ProductCards extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Products by #name#"));
        Vector<ProductDataMockup> productList = ProductDataMockup.getProductList();
        for(int i=0; i< productList.size(); i++){
                ProductDataMockup product = productList.elementAt(i);
                toClient.println("<table border='1'>");
                toClient.println("<tr>");
                toClient.println("<td colspan='2'>" + product.productName + " </td>");
                toClient.println("</tr>");
                toClient.println("<tr>");
                toClient.println("<td colspan='2'>" + "<img src='http://northbrick1.appspot.com/images/" + 
                  + product.productId + ".png'>" + "</td>");
                toClient.println("</tr>");
                toClient.println("<tr>");
                toClient.println("<td> Code: </td><td>" + product.productId + " </td>");
                toClient.println("</tr>");
                toClient.println("<tr>");
                toClient.println("<td> Company: </td><td>" + product.companyName + " </td>");
                toClient.println("</tr>");
                toClient.println("<tr>");
                toClient.println("<td> Price: </td><td><span>" + product.unitPrice + " </span></td>");
                toClient.println("</tr>");
                toClient.println("</table>");
        }
        toClient.println("<script src='products.js'></script>");
        toClient.println(Utils.footer("Products"));
        toClient.close();
    }
}
