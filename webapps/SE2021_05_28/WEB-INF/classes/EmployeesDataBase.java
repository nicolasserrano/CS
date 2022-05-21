import java.util.Vector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeesDataBase  {
    int    employeeId;
    String lastName;
    String firstName;
    int    extension;
    String image;

    EmployeesDataBase (int    employeeId, String lastName, String firstName, int extension, String image) {
        this.employeeId = employeeId;
        this.lastName   = lastName;
        this.firstName  = firstName;
        this.extension  = extension;
        this.image  = image;
    }
    public static Vector<EmployeesDataBase> getEmployeesList(Connection connection) {
        Vector<EmployeesDataBase> vec = new Vector<EmployeesDataBase>();
        String sql = "Select EmployeeId, LastName, FirstName, Extension FROM Employees";
//        sql += " WHERE Products.SupplierId = Suppliers.SupplierId";
        System.out.println("getEmployeesList: " + sql);
        try {
            Statement statement=connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                EmployeesDataBase employee = new EmployeesDataBase(
                    Integer.parseInt(result.getString("EmployeeId")),
                    result.getString("LastName"),
                    result.getString("FirstName"),
                    Integer.parseInt(result.getString("Extension")),
                    null
                );
                vec.addElement(employee);
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error in getEmployeesList: " + sql + " Exception: " + e);
        }
        return vec;
    }
    
}