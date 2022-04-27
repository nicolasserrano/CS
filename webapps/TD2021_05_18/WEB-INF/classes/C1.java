class C1 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        String out = createForm (num);
        System.out.println(out);
    }
    public static String createForm (int num) {
        String out = "";
        out += "<form method='GET' action='S2'>";
        out += "products: ";
        out += "<input type='text' name='products' value='" + num + "'></input><BR>";
        out += "<p align='center'>";
        out += "<pre>";
        for (int i = 0; i < num; i++) {
          out += "Product " + i + ": <input type='text' name='P" + i + "' value='1'></input><BR>";
        }
        out += "<input type='submit'>";
        out += "</pre>";
        out += "</form>";
        return out;
    }
}