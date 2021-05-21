import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class InsertEmployee extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String idStr = req.getParameter("productId");
        EmployeesDataBase employee = new EmployeesDataBase(
                    0,
                    req.getParameter("firstName"),
                    req.getParameter("lastName"),
                    Integer.parseInt(req.getParameter("extension")),
                    null
                );
        String id = EmployeesDataBase.insertEmployee(connection, employee);
        
        out.println(id);
    }
}