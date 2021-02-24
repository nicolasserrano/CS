import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class CountriesList extends HttpServlet {
    static String baseUrl="http://www.nicolasserrano.com/CS/webapps/auxiliary/CountryFlags/";

    public void doGet(HttpServletRequest req, HttpServletResponse res) 
      throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Countries by Name Surname"));
        toClient.println("<table id='countryTable' border='1'>");
        Vector<CountryDataMockup> countryList = CountryDataMockup.getCountryList();
        toClient.println("<tr>");
        toClient.println("<td>Id</td>");
        toClient.println("<td>Code</td>");
        toClient.println("<td>Name</td>");
        toClient.println("<td>Flag</td>");
        toClient.println("</tr>");
        for(int i=0; i< countryList.size(); i++){
                CountryDataMockup country = countryList.elementAt(i);
                toClient.println("<tr>");
                toClient.println("<td>" + country.countryId + " </td>");
                toClient.println("<td>" + country.countryCode + " </td>");
                toClient.println("<td>" + country.countryName + " </td>");
                toClient.println("<td><img src='" + baseUrl + country.flagFile + "'></td>");
                toClient.println("</tr>");
        }

        toClient.println("</table>");
        toClient.println("<script src='countries.js'></script>");
        toClient.println(Utils.footer("Countries"));
        toClient.close();
    }
}
