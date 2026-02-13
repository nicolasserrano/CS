import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RobotListMockup extends HttpServlet {

    String imagePath = "https://nicolasserrano.github.io/CS/webapps/auxiliary/robots/image";
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Robot Store, developed by Student Name"));
        
        toClient.println("<h1 style='text-align: center;'>List of Robots</h1>");
        toClient.println("<table border='1' style='text-align: center;'>");
            toClient.println("<tr>");
        
        Vector<RobotDataMockup> robotList = RobotDataMockup.getRobotList();
        
        for(int i = 0; i < robotList.size(); i++) {
            toClient.println("<td>");
            RobotDataMockup robot = robotList.elementAt(i);
            toClient.println("<table>");
            toClient.println("<tr>");
            toClient.println("<td colspan='2'><img width='160px' src='" + imagePath + (i+1) + ".jpg'></td>");
            toClient.println("</tr>");
            toClient.println("<tr><td><b>Name:</b></td><td>" + robot.name + "</td></tr>");
            toClient.println("<tr><td><b>Company:</b></td><td><a href='" + robot.url + "'>" + robot.company + "</a></td></tr>");
            toClient.println("<tr><td><b>Height (m):</b></td><td>" + robot.height + "</td></tr>");
            toClient.println("<tr><td><b>Weight (kg):</b></td><td>" + robot.weight + "</td></tr>");
            toClient.println("<tr><td><b>Speed (km/h):</b></td><td>" + (robot.speed == -1 ? "Unknown" : robot.speed) + "</td></tr>");
            toClient.println("<tr><td><b>Payload (kg):</b></td><td>" + (robot.payload == -1 ? "Unknown" : robot.payload) + "</td></tr>");
            toClient.println("<tr><td><b>Battery Life (hrs):</b></td><td>" + (robot.battery == -1 ? "Unknown" : robot.battery) + "</td></tr></table>");
            toClient.println("</td>");
        }
        
        toClient.println("</tr>");
        toClient.println("</table>");
        toClient.println(Utils.footer("Panoptos"));
        toClient.close();
    }
}
