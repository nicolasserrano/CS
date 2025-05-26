import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class SuppliersList extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        String categoryId = req.getParameter("id");

        toClient.println(Utils.header("Suppliers List"));
        Vector<SupplierDatabase> supplierList;
        supplierList = SupplierDatabase.getSupplierList(connection);
        String currentCountry = "";
        
        toClient.println("<table border='1'>");
        
        for(int i=0; i< supplierList.size(); i++){
                SupplierDatabase supplier = supplierList.elementAt(i);
                if (!supplier.country.equals(currentCountry)){
                    currentCountry = supplierList.elementAt(i).country;
                    toClient.println("<tr class='countryClients' id='"+currentCountry+"'><th colspan=3>Suppliers from "+currentCountry+" </th><th colspan=2><img src= http://nicolasserrano.github.io/CS/webapps/auxiliary/CountryFlags/flag-"+currentCountry.toLowerCase()+".jpg onmouseover=countryCustomers('" + currentCountry + "')></center></th>");
                    //toClient.println("<th></th>");
                    toClient.println("</tr>");
                }
                toClient.println("<tr>");
                //toClient.println("<td><img src='http://picsum.photos/seed/"+supplier.supplierID+"/128/64'> </td>");
                toClient.println("<td><a href=EditSupplier?id=" + supplier.supplierID + ">Edit</a></td>");
                toClient.println("<td>"+supplier.supplierID+ "</td>");
                toClient.println("<td><span onmouseover=editName(this)>" + supplier.companyName + "</span></td>");
                toClient.println("<td>" + supplier.city + "</td>");
                toClient.println("<td><span>" + supplier.postalCode + "</span></td>");
                toClient.println("</tr>");
        }
        toClient.println("</table>");
        toClient.println("<script src='countryCustomers.js'></script>");
        toClient.println("<script src='editName.js'></script>");
        toClient.println(Utils.footer("Suppliers"));
        toClient.close();
    }
    
    public String findFlag(String country){
        Vector<CountryDataMockup> countryList = CountryDataMockup.getCountryList();
        for(int i = 0; i<countryList.size(); i++){
            if (countryList.elementAt(i).countryName.equals(country)){
                return countryList.elementAt(i).flagFile;
            }
        }
        return "";
    }
}