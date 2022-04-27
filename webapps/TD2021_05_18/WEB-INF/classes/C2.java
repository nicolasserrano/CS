class C2 {
    public static void main(String [] v) {
        System.out.println(printProducts(v));
    }
    public static String printProducts(String [] v) {
        String salida = "";
        salida += "<html><body>";            
        salida += "<form method='GET' action='S3'>";
        salida += "<TABLE BORDER=\"1\">";
        for (int i=0; i< v.length; i++) {
            int val = Integer.parseInt(v[i]);
            salida += "<TR>";
            salida += "<TD>" + "Product " + i + "</TD>";
            for (int j=0; j< val; j++) {
                salida += "<TD>" + "<input type='checkbox' checked name='p_" + i + "' value='" + j + "'>" + "</TD>";
            }
            salida += "</TR>";
        }
        salida += "</TABLE>  <p align=\"center\">";
        salida += "<input name='products' value='" + v.length + "'>";
        salida += "<input type='submit'>";
        salida += "</form>";            
        salida += "</body></html>";            
        return salida;
    }
}