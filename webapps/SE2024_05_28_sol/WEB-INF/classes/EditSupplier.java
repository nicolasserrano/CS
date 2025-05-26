import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class EditSupplier extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Edit Supplier Form. Servlet developed by #your name#"));
        String supplierId = req.getParameter("id");
        SupplierDatabase supplier = SupplierDatabase.getSupplier(connection, supplierId);
        
        Vector<String> supplierCityList;
        supplierCityList = SupplierDatabase.getSupplierCityList(connection, supplier.country);
 
        toClient.println("<form action='UpdateSupplier' method='GET'>");
        toClient.println("<input type=text name='id' value='" + supplier.supplierID + "'>");
        toClient.println("<table border='1'>");
        toClient.println("<tr><td>Country</td>");
        toClient.println("<td><img src= http://nicolasserrano.github.io/CS/webapps/auxiliary/CountryFlags/flag-"+supplier.country.toLowerCase()+".jpg ><br><input name='country' type='text' value='" + supplier.country + "'></input></td></tr>");
        toClient.println("<tr><td>Company Name</td>");
        toClient.println("<td><input name='companyName' value='" + supplier.companyName + "'></td></tr>");
        toClient.println("<tr><td>City</td>");
        toClient.println("<td><select name='city'>");
        for (int i=0; i< supplierCityList.size(); i++) {
            String city = supplierCityList.elementAt(i);
            toClient.println("<option value='" + city + "'>" + city + "</option>");
        }
//        toClient.println("<option value='Melbourne'>Sydney</option>");
        toClient.println("<option value='Other'>Other</option>");
        toClient.println("</select><br><input name='other'></td></tr>");
        toClient.println("<tr><td>Postal code</td>");
        toClient.println("<td><input name='postalCode' value='" + supplier.postalCode + "'></td></tr>");
        toClient.println("</table>");
        toClient.println("<input type='submit'>");
        toClient.println("</form>");
        toClient.println(Utils.footer("Supplier Form"));
        toClient.close();
    }
}