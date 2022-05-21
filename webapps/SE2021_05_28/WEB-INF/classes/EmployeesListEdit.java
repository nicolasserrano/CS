import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class EmployeesListEdit extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Employees list"));
        Vector<EmployeesDataBase> employeesList = EmployeesDataBase.getEmployeesList(connection);
        toClient.println("<h3 align='center'>Number of employees: " + employeesList.size() + "</h3>");
        toClient.println("<table id='productTable' border='1'>");
        for(int i=0; i< employeesList.size(); i++){
                EmployeesDataBase employee = employeesList.elementAt(i);
                toClient.println("<tr>");
                String src = "https://nicolasserrano.github.io/CS/webapps/auxiliary/images/";
                //String src = "images/";
                if (employee.employeeId < 10) {
                    src += "emp" + employee.employeeId + ".jpg";
                } else {
                    src += "person.png";
                }
                toClient.println("<td><img src='" + src + "'></td>");
                toClient.println("<td><h2><span>" + employee.employeeId + "</span> - <span>" + employee.firstName + "</span> <span>" + employee.lastName + "</span></h2><h3>Ext: <span>" + employee.extension + "</span></h3></td>");
                toClient.println("</tr>");
        }

        toClient.println("</table>");
        toClient.println("<script src='employeesListEdit.js'></script>");
        toClient.println(Utils.footer("Employees list"));
        toClient.close();
    }
}