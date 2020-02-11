import java.util.Vector;

public class ProductOrdersData  {
    int    orderId;
    String customerId;
    String customerName;
    int    quantity;
    
    ProductOrdersData (int    orderId, String customerId, String customerName, int quantity) {
        this.orderId    = orderId;
        this.customerId  = customerId;
        this.customerName   = customerName;
        this.quantity = quantity;
    }
    public static Vector<ProductOrdersData> getProductOrdersList() {
        Vector<ProductOrdersData> vec = new Vector<ProductOrdersData>();
        vec.addElement(new ProductOrdersData(10317, "LONEP", "Lonesome Pine Restaurant", 20));
        vec.addElement(new ProductOrdersData(10368, "ERNSH", "Ernst Handel", 35));
        vec.addElement(new ProductOrdersData(10380, "HUNGO", "Hungry Owl All-Night Grocers", 6));
        vec.addElement(new ProductOrdersData(10856, "ANTON", "Antornio Moreno Taqueria", 20));
        vec.addElement(new ProductOrdersData(10923, "LAMAI", "La maison d'Asie", 10));
        return vec;
    }
    public static ProductOrdersData getProduct(int i) {
        return getProductOrdersList().elementAt(i - 1);
    }
    
}
