import java.sql.*;

class JDBC_Access {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        String file = "northbrick.mdb";
        String url=new String("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};Dbq=" + file + "");
        Connection connection = DriverManager.getConnection(url);
        
        Statement stmt = connection.createStatement();
        String sql = "SELECT Count(*) as count FROM Orders";
        System.out.println("SQL: " + sql);
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            String count = rs.getString("count");
            System.out.println("count: " + count);
        }
        
        rs.close();
        stmt.close();
        connection.close();
    }
}