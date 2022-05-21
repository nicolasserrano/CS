import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class EmployeesListDB extends HttpServlet {
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
        int type = 2;
                toClient.println("<tr>");
                toClient.println("<td><img src='https://nicolasserrano.github.io/CS/webapps/auxiliary/images/Ok.png'></td>");
                toClient.println("<td><h2>" + "0" + " - " + "Nombre autor" + " " + "Apellido" + "<h2><h3>Ext: <span>" + "901234" + "</span></h3></td>");
                toClient.println("</tr>");

        for(int i=0; i< employeesList.size(); i++){
                EmployeesDataBase employee = employeesList.elementAt(i);
                toClient.println("<tr>");
                if (type == 1){
                    toClient.println("<td>" + employee.firstName + " </td>");
                    toClient.println("<td>" + employee.lastName + " </td>");
                    toClient.println("<td>" + employee.extension + " </td>");
                    toClient.println("<td>" + employee.image + " </td>");
                } else {
                    String src = "https://nicolasserrano.github.io/CS/webapps/auxiliary/images/";
                    //String src = "images/";
                    if (employee.employeeId < 10) {
                        src += "emp" + employee.employeeId + ".jpg";
                    } else {
                        src += "person.png";
                    }
                    toClient.println("<td><img src='" + src + "'></td>");
                    toClient.println("<td><h2>" + employee.employeeId + " - " + employee.firstName + " " + employee.lastName + "<h2><h3>Ext: <span>" + employee.extension + "</span></h3></td>");
                }
                toClient.println("</tr>");
        }

        toClient.println("</table>");
        //toClient.println("<script src='employeesList.js'></script>");
        toClient.println("<script src='employeesNew.js'></script>");
        toClient.println("<script src='insertEmployee.js'></script>");
        toClient.println(Utils.footer("Employees list"));
        toClient.close();
    }
}