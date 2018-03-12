import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings("serial")
public class CheckLogin extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        boolean logged = check(connection, login, password);
        System.out.println("check Login logged: " + logged);
        System.out.println("check Login login, password: " + login + " " + password);
        if (logged) {
            HttpSession session = req.getSession(true);
            session.setAttribute("login", login);
            res.sendRedirect("ProductList");
        } else {
            PrintWriter toClient = res.getWriter();
            toClient.println(Utils.header("Category Form"));
            toClient.println("</h1>Login incorrect</h1>");
            toClient.println(Utils.footer("Category Form"));
            toClient.close();
        }
    }
    
    boolean check(Connection connection, String login, String password) {
        String sql = "Select EmployeeID FROM Employees";
        sql += " WHERE FirstName=? and Password=?";
        System.out.println("check Login: " + sql);
        boolean logged = false;
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, login);
            pstmt.setString(2, password);
            ResultSet result = pstmt.executeQuery();
            if(result.next()) {
                logged = true;
           }
            result.close();
            pstmt.close();
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error in check login: " + sql + " Exception: " + e);
        }
        return logged;
    }
}