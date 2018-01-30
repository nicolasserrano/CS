import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class HelloWorld extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello World");

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //Step 3
            Connection connection = DriverManager.getConnection("jdbc:odbc:northbrick");   //Step 4
            
            Statement stmt = connection.createStatement();  // Step 5
            ResultSet rs = stmt.executeQuery("Select * from Shippers");   //Step 6
            
            while(rs.next()) {   //Step 7
                out.print( rs.getString("CompanyName")+", ");
                out.println(rs.getString("Phone"));
            }
            
            //Step 8
            rs.close();
            stmt.close();
            
            //Step 9
            connection.close();
                // Catch any exceptions that are thrown.
        } catch(ClassNotFoundException e) {
              System.out.println(e.toString());
        } catch(SQLException e) {
            
	      System.out.println(e.toString());
        }

    }
}