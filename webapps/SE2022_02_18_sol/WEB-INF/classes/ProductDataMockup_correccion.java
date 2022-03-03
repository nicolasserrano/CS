import java.util.Vector;

public class ProductDataMockup {
    int    productId;
    String productName;
    int    supplierId;
    String companyName;
    float  unitPrice;
    
    ProductDataMockup (int productId, String productName, int supplierId, String companyName, float unitPrice) {
        this.productId    = productId;
        this.productName  = productName;
        this.supplierId   = supplierId;
        this.companyName = companyName;
        this.unitPrice = unitPrice;
    }
    public static Vector<ProductDataMockup> getProductList() {
        Vector<ProductDataMockup> vec = new Vector<ProductDataMockup>();
        vec.addElement(new ProductDataMockup(31, "Producto 1", 1, "Brick Manufactures, Co. Empresa 1", 0.011f));
        vec.addElement(new ProductDataMockup(32, "Homemaker Cupboard 4 x 4 x 4", 1, "Brick Manufactures, Co. Empresa 2", 0.022f));
        return vec;
    }
    public static ProductDataMockup getProduct(int i) {
        return getProductList().elementAt(i - 1);
    }
    
}
