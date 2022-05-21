import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class EditName extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Employee Name Form. Servlet developed by #your name#"));
        String idStr = req.getParameter("id");
        EmployeesDataBase employee = EmployeesDataBase.getEmployee(connection, idStr);
        toClient.println("<form action='ModifyName' method='GET'>");
        toClient.println("<table border='1'>");
        toClient.println("<tr><td>Id</td>");
        toClient.println("<td><input name='employeeId' type='text' readonly value='" + employee.employeeId + "'></input></td></tr>");
        toClient.println("<tr><td>First Name</td>");
        toClient.println("<td><input name='firstName' value='" + employee.firstName + "'></td></tr>");
        toClient.println("<tr><td>Last Name</td>");
        toClient.println("<td><input name='lastName' value='" + employee.lastName + "'></td></tr>");
        toClient.println("<tr><td>extension</td>");
        toClient.println("<td><input name='extension' value='" + employee.extension + "'></td></tr>");
        toClient.println("</table>");
        toClient.println("<input type='submit'>");
        toClient.println("</form>");
        toClient.println(Utils.footer("Employee Form"));
        toClient.close();
    }
}