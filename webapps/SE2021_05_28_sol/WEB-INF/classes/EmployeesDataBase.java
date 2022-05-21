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
    public static EmployeesDataBase getEmployee(Connection connection, String id) {
        EmployeesDataBase employee = null;
        String sql = "Select EmployeeId, LastName, FirstName, Extension FROM Employees";
        sql += " WHERE EmployeeId = ?";
        System.out.println("getEmployee: " + sql);
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet result = pstmt.executeQuery();
            if(result.next()) {
                    employee = new EmployeesDataBase(
                    Integer.parseInt(result.getString("EmployeeId")),
                    result.getString("LastName"),
                    result.getString("FirstName"),
                    Integer.parseInt(result.getString("Extension")),
                    null
                );
            }
            result.close();
            pstmt.close();
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("SQLException in getEmployee: " + sql + " Exception: " + e);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception in getEmployee: " + sql + " Exception: " + e);
        }
        return employee;
    }
    public static EmployeesDataBase getEmployee(Connection connection, int i) {
        return getEmployeesList(connection).elementAt(i - 1);
    }
    
    public static String insertEmployee(Connection connection, EmployeesDataBase employee) {
        String sql ="INSERT INTO Employees (firstName, lastName, extension) "
            + "VALUES (?, ?, ?)";
        System.out.println("insert employee: " + sql);
        int n = 0;
        String id = null;
        try {
            PreparedStatement stmtUpdate= connection.prepareStatement(sql);
            stmtUpdate.setString(1, employee.firstName);
            stmtUpdate.setString(2, employee.lastName);
            stmtUpdate.setInt(3, employee.extension);
            n = stmtUpdate.executeUpdate();
            System.out.println("inserted employees: " + n);
            stmtUpdate.close();
            String sqlId = "SELECT @@identity as Id FROM Employees";
            PreparedStatement stmtId= connection.prepareStatement(sqlId);
            ResultSet resultId = stmtId.executeQuery();
            if (resultId.next()) {
                id = resultId.getString("Id");
                System.out.println("id: " + id);
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("SQLException in insertOrderDetail: " + sql + " Exception: " + e);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception in insertOrderDetail: " + sql + " Exception: " + e);
        }
        return id;
    }
    
    public static int updateEmployeeName(Connection connection, EmployeesDataBase employee) {
        String sql ="UPDATE Employees "
            + "SET firstName = ?, lastName = ?, extension = ?"
            + " WHERE EmployeeId = ?";
        System.out.println("updateEmployeeName: " + sql);
        int n = 0;
        try {
            PreparedStatement stmtUpdate= connection.prepareStatement(sql);
            stmtUpdate.setString(1,employee.firstName);
            stmtUpdate.setString(2,employee.lastName);
            stmtUpdate.setInt(3,employee.extension);
            stmtUpdate.setInt(4,employee.employeeId);
            n = stmtUpdate.executeUpdate();
            stmtUpdate.close();
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("SQLException in updateEmployeeName: " + sql + " Exception: " + e);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception in updateEmployeeName: " + sql + " Exception: " + e);
        }
        return n;
    }
}