import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class EmployeesList extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
		toClient.println(Utils.header("Employee list"));
		
		toClient.println("<center> developed by miguel-a905001</center>");
		Vector<EmployeesData> NUMEMPLO= EmployeesData.getEmployeesList()
		toClient.println(" number of employees: "+NUMEMPLO.size());
		
		
		toClient.println("<table border='1'>");
       
        for(int i=0; i< NUMEMPLO.size(); i++){
			
            EmployeesData EMPLO = NUMEMPLO.elementAt(i);
            toClient.println("<tr>");
			toClient.println("<td>"+EMPLO.image+"</td>");
            toClient.println("<td>" + EMPLO.employeeId +EMPLO.firstName+ EMPLO.lastName"</td><br> ");
            toClient.println("<td><br> ext: " + EMPLO.extension + " </td></br>");
            toClient.println("</tr>");
        }

        toClient.println("</table>");
        toClient.println("<script src='EmployeesListJS.js'></script>");
        toClient.println(Utils.footer("Employee list"));
        toClient.close();
    }
}
}
		