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
}
