import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class EmployeesList extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Employees list, developed by YOUR NAME - CARD ID"));
        Vector<EmployeesData> employeesList = EmployeesData.getEmployeesList();
        toClient.println("<h3 align='center'>Number of employees: " + employeesList.size() + "</h3>");
        toClient.println("<table id='productTable' border='1'>");
        int type = 2;
        for(int i=0; i< employeesList.size(); i++){
                EmployeesData employee = employeesList.elementAt(i);
                toClient.println("<tr>");
                if (type == 1){
                    toClient.println("<td>" + employee.firstName + " </td>");
                    toClient.println("<td>" + employee.lastName + " </td>");
                    toClient.println("<td>" + employee.extension + " </td>");
                    toClient.println("<td>" + employee.image + " </td>");
                } else {
                    toClient.println("<td><img src='https://nicolasserrano.github.io/CS/webapps/auxiliary/images/" + employee.image + "'></td>");
                    toClient.println("<td><h2>" + (i+1) + " - " + employee.firstName + " " + employee.lastName + "<h2><h3>Ext: <span>" + employee.extension + "</span></h3></td>");
                }
                toClient.println("</tr>");
        }

        toClient.println("</table>");
        toClient.println("<script src='employeesList.js'></script>");
        toClient.println(Utils.footer("Employees list"));
        toClient.close();
    }
}