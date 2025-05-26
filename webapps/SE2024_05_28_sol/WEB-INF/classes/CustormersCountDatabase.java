import java.util.Vector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustormersCountDatabase {
    public static String getCustomersCount(Connection connection, String country) {
        String sql = "Select count(*) as res FROM Customers where Country = ?;";
        System.out.println("getCustomersCount: " + sql);
        String res = "";
        try {
            PreparedStatement statement= connection.prepareStatement(sql);
            statement.setString(1, country);
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                res = result.getString("res");
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error in getCustomersCount: " + sql + " Exception: " + e);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Error in getCustomersCount: " + sql + " Exception: " + e);
        }
        return res;
    }
}
