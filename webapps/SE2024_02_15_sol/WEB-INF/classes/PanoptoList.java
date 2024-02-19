import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PanoptoList extends HttpServlet {

    String imagePath = "https://nicolasserrano.github.io/CS/webapps/auxiliary/images/";
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Panopto list, developed by Student Name"));
        toClient.println("<div id='place'></div>");
        toClient.println("<table border='1'>");
        Vector<PanoptoDataMockup> panoptoList = PanoptoDataMockup.getPanoptoList();
        for(int i=0; i< panoptoList.size(); i++){
            PanoptoDataMockup panopto = panoptoList.elementAt(i);
            toClient.println("<tr>");
            toClient.println("<td><b>" + panopto.title + " </b></td>");
            toClient.println("<td>");
            toClient.println("<img width='280px' src='" + imagePath + "cover" + panopto.order + ".jpg'></img>");
            toClient.println("</td>");
            toClient.println("<td>");
            toClient.println("<div>Link: <a target='_blank' href='https://unav.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=" + panopto.panoptoId + "'>Video in new tab</a></div>");
            toClient.println("<div>Order:" + panopto.order + " </div>");
            toClient.println("<div>Length:" + panopto.duration + " </div>");
            toClient.println("</td>");
            toClient.println("</tr>");
        }


        toClient.println("</table>");
        toClient.println("<script src='panopto.js'></script>");
        toClient.println(Utils.footer("Panoptos"));
        toClient.close();
    }
}
