import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class ModifyName extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String employeeIdStr = req.getParameter("employeeId");
        String firstNameStr = req.getParameter("firstName");
        String lastNameStr = req.getParameter("lastName");
        String extensionStr = req.getParameter("extension");
        out.println("employeeId: " + employeeIdStr + " first name: " + firstNameStr + " last name: " + lastNameStr
          + " extension: " + extensionStr + " at " + java.time.LocalDateTime.now());
    }
}

