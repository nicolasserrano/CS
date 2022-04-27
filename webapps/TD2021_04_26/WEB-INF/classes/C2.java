class C2 {
    public static String salidaHTML (String[] palabras) {

    int n = palabras.length;

    String salida = "";
    salida += "<html>";
    salida += "<head>";
    salida += "<title>Palabras</title>";
    salida += "</head>";
    salida += "<body bgcolor=\"#FFFFFF\" text=\"#631818\">";
    salida += "<p align=\"center\"><font size=\"6\"><b>Palabras</b></font></p>";
    salida += "<form method=\"GET\" action=\"S3\"><BR>";
    salida += "<p align=\"center\">";
    salida += "Palabras: <input name=palabras type='text' value = '" + n + "'>";
    salida += "<TABLE BORDER=\"1\">";
    int value;
    int cont = 0;
    for (int i=0; i< n; i++) {
        salida += "<TR>";
        salida += "<TD>" + palabras[i] + "<input name=palabra_" + i + " type='text' value = '" + palabras[i] + "'></TD>";
        salida += "<TD><HR width=" + (palabras[i].length() * 40) + "px size=20px align=left color=blue></TD>";
        salida += "</TR>";
    }
    salida += "</TABLE>  <p align=\"center\">";
    salida += "<input type=\"submit\" value=\"Enviar\">";
    salida += "</form>";
    salida += "</body>";
    salida += "</html>";
    return salida;
    }
}
