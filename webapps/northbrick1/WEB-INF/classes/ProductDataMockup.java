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
        vec.addElement(new ProductDataMockup(1, "Chai", 1, "Exotic Liquids", 18.0f));
        vec.addElement(new ProductDataMockup(2, "Chang", 1, "Exotic Liquids", 19.0f));
        vec.addElement(new ProductDataMockup(3, "Aniseed Syrup", 1, "Exotic Liquids", 10.0f));
        vec.addElement(new ProductDataMockup(4, "Chef Anton's Cajun Seasoning", 2, "New Orleans Cajun Delights", 22.0f));
        return vec;
    }
}
