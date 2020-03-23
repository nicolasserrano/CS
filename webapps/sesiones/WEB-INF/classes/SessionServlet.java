import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionServlet extends HttpServlet {

  public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	HttpSession session = request.getSession(true);
   

// Generate Output
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>" +
      "<head><title>Session Information</title></head>" +
      "<body bgcolor=\"#FFFFFF\">" +
      "<h1>Session Information</h1><table>");
    out.println ("<table border=\"1\">");
    out.println ("<tr><td>Identifier</td>");
    out.println ("<td>" + session.getId() + "</td></tr>");
    out.println ("<tr><td>Created</td>");
    out.println ("<td>" + new Date(session.getCreationTime()) + "</td></tr>");
    out.println ("<tr><td>Last Accessed</td>");
    out.println ("<td>" + new Date(session.getLastAccessedTime()) + "</td></tr>");
    out.println ("<tr><td>New Session?</td>");
    out.println ("<td>" + session.isNew() + "</td></tr>");
    Enumeration names = session.getAttributeNames();
    for ( ; names.hasMoreElements(); ) {
      String name = (String)names.nextElement();
      out.println ("<tr><td>" + name + "</td>");
      out.println ("<td>" + session.getAttribute (name) + "</td></tr>");
    }
    out.println("</table></center>");    
    out.println("</body></html>");
    out.close();
  }
}