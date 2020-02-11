import java.util.Vector;

class Test  {
     public static void main(String[] args) {
        Vector<ProductDataMockup> productList = ProductDataMockup.getProductList();
        int element = Integer.parseInt(args[0]);
        ProductDataMockup product = productList.elementAt(element);
        System.out.println(Utils.header("Product"));
        System.out.println("<pre>");
        System.out.println("Product id :" + product.productId);
        System.out.println("Name: " + product.productName);
        System.out.println("Supplier: " + product.supplierId);
        System.out.println("Company name: " + product.companyName);
        System.out.println("Price: " + product.unitPrice);
        System.out.println("</pre>");
        System.out.println(Utils.footer("Product"));
     }
}