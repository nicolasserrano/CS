import java.util.Vector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplierDatabase {
    String supplierID;
    String companyName;
    String city;
    String country;
    String postalCode;
    
    SupplierDatabase (String supplierID, String companyName, String city, String country, String postalCode) {
        this.supplierID    = supplierID;
        this.companyName  = companyName;
        this.city   = city;
        this.country   = country;
        this.postalCode   = postalCode;
    }
    public static Vector<SupplierDatabase> getSupplierList(Connection connection) {
        Vector<SupplierDatabase> vec = new Vector<SupplierDatabase>();
        String sql = "Select SupplierID, CompanyName, City, Country, PostalCode FROM Suppliers order by Country, SupplierID;";
        System.out.println("getSupplierList: " + sql);
        try {
            Statement statement=connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                SupplierDatabase supplier = new SupplierDatabase(
                    result.getString("SupplierID"),
                    result.getString("CompanyName"),
                    result.getString("City"),
                    result.getString("Country"),
                    result.getString("PostalCode")
                );
                vec.addElement(supplier);
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error in getSupplierList: " + sql + " Exception: " + e);
        }
        return vec;
    }
    public static SupplierDatabase getSupplier(Connection connection, String id) {
        SupplierDatabase supplier = null;
        String sql = "Select SupplierID, CompanyName, City, Country, PostalCode FROM Suppliers WHERE SupplierID = ?;";
        System.out.println("getSupplier: " + sql);
        try {
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                supplier = new SupplierDatabase(
                    result.getString("SupplierID"),
                    result.getString("CompanyName"),
                    result.getString("City"),
                    result.getString("Country"),
                    result.getString("PostalCode")
                );
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error in getSupplierList: " + sql + " Exception: " + e);
        }
        return supplier;
    }
    public static Vector<String> getSupplierCityList(Connection connection, String country) {
        Vector<String> vec = new Vector<String>();
        String sql = "Select City FROM Suppliers WHERE Country = ? order by City;";
        System.out.println("getSupplierCityList: " + sql);
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, country);
            ResultSet result = preparedStatement.executeQuery();
            while(result.next()) {
                String city = result.getString("City");
                vec.addElement(city);
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error in getSupplierCityList: " + sql + " Exception: " + e);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Error in getSupplierCityList: " + sql + " Exception: " + e);
        }
        return vec;
    }
    
    public static int UpdateSupplier(Connection connection, SupplierDatabase supplier) {
        String sql = "UPDATE Suppliers SET CompanyName = ?, City = ?, Country = ?, PostalCode = ? "
            + "WHERE SupplierID = ?";
        System.out.println("update Suppliers: " + sql);
        int n = 0;
        try {
            PreparedStatement stmtUpdate= connection.prepareStatement(sql);
            stmtUpdate.setString(1, supplier.companyName);
            stmtUpdate.setString(2, supplier.city);
            stmtUpdate.setString(3, supplier.country);
            stmtUpdate.setString(4, supplier.postalCode);
            stmtUpdate.setString(5, supplier.supplierID);
            n = stmtUpdate.executeUpdate();
            System.out.println("updated supplier: " + n);
            stmtUpdate.close();
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("SQLException in UpdateSupplier: " + sql + " Exception: " + e);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception in UpdateSupplier: " + sql + " Exception: " + e);
        }
        return n;
    }
    public static int UpdateSupplierName(Connection connection, String id, String companyName) {
        String sql = "UPDATE Suppliers SET CompanyName = ? "
            + "WHERE SupplierID = ?";
        System.out.println("update Supplier name: " + sql);
        int n = 0;
        try {
            PreparedStatement stmtUpdate= connection.prepareStatement(sql);
            stmtUpdate.setString(1, companyName);
            stmtUpdate.setString(2, id);
            n = stmtUpdate.executeUpdate();
            System.out.println("updated supplier: " + n);
            stmtUpdate.close();
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("SQLException in UpdateSupplierName: " + sql + " Exception: " + e);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception in UpdateSupplierName: " + sql + " Exception: " + e);
        }
        return n;
    }
}
