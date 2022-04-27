class C1 {
    public static String salidaHTML (String strRows, String strCols) {
        int rows = Integer.parseInt(strRows);
        int cols = Integer.parseInt(strCols);
        String salida = "";
        salida += "<html>";
        salida += "<body>";
        salida += "<form action=S2 method=GET>";
        salida += "<textarea rows='" + rows + "' name='texto' cols='" + cols + "'>Texto de prueba de la caja de texto</textarea>";
        salida += "<br><input type=submit>";
        salida += "</form>";
        salida += "</body>";
        salida += "</html>";
        return salida;
    }
    
    public static void main(String[] args) {
        System.out.println(salidaHTML(args[0], args[1]));
    }
}
