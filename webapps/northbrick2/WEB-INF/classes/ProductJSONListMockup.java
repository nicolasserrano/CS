import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ProductJSONListMockup extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Products"));
        toClient.print("<div id='list'></div>");
        toClient.print("<script>data=[");
        Vector<ProductDataMockup> productList = ProductDataMockup.getProductList();
        for(int i=0; i< productList.size(); i++){
                ProductDataMockup product = productList.elementAt(i);
                if (i!=0) {
                    toClient.print(",");
                    }
                toClient.print("{");
                toClient.print("\"productId\":\"" + product.productId + "\"");
                toClient.print(",\"productName\":\"" + product.productName + "\"");
                toClient.print(",\"companyName\":\"" + product.companyName + "\"");
                toClient.print(",\"unitPrice\":\"" + product.unitPrice + "\"");
                toClient.print("}");
        }

        toClient.println("]</script>");
        toClient.println("<script src='createTable.js'></script>");
//        toClient.println("<script src='productList.js'></script>");
        toClient.println(Utils.footer("Products"));
        toClient.close();
    }
}