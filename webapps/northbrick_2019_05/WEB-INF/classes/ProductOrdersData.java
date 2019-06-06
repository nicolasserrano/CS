import java.util.Vector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductOrdersData {

    String orderId;
    String customerId;
    String customerName;
    int quantity;
    
    ProductOrdersData (String orderId, String customerId, String customerName, int quantity) {
        this.orderId    = orderId;
        this.customerId  = customerId;
        this.customerName   = customerName;
        this.quantity = quantity;
    }

    public static Vector<ProductOrdersData> getProductOrdersList(Connection connection, String id) {
        Vector<ProductOrdersData> vec = new Vector<ProductOrdersData>();
        String sql = "SELECT Orders.OrderID AS oid, Orders.CustomerId AS cid, CompanyName, Quantity From [Order Details], Orders, Customers Where [Order Details].OrderID = Orders.OrderID AND Orders.CustomerID = Customers.CustomerID AND ProductID = ?";
        System.out.println("getProductOrdersList: " + sql);
        try {
            PreparedStatement pstmt=connection.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet result = pstmt.executeQuery();
            while(result.next()) {
                ProductOrdersData productOrder = new ProductOrdersData(
                    result.getString("oid"),
                    result.getString("cid"),
                    result.getString("CompanyName"),
                    Integer.parseInt(result.getString("Quantity"))
                );
                vec.addElement(productOrder);
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error in getProductOrdersList: " + sql + " Exception: " + e);
        }
        return vec;
    }


}
