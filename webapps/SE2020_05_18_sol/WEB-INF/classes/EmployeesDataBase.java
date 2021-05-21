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
/*
        vec.addElement(new EmployeesDataBase(1, "Davolio", "Nancy", 5467, "empF47630.jpg"));
        vec.addElement(new EmployeesDataBase(2, "Fuller", "Andrew", 3457, "empM48612.jpg"));
        vec.addElement(new EmployeesDataBase(3, "Leverling", "Janet", 3355, "empF42968.jpg"));
        vec.addElement(new EmployeesDataBase(4, "Peacock", "Margaret", 5176, "empF96373.jpg"));
        vec.addElement(new EmployeesDataBase(5, "Buchanan", "Steven", 3453, "empM64341.jpg"));
        */
        return vec;
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
            System.out.println("Error in insertOrderDetail: " + sql + " Exception: " + e);
        }
        return id;
    }
}