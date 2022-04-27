class C3 {
    public static void main(String [] v) {
        System.out.println(printLines(v));
    }
    public static String printLines(String [] v) {
        int sum = 0;
        for (int i=0; i< v.length; i++) {
            System.out.println(v[i]);
            sum += Integer.parseInt(v[i]);
        }
        int rows[][] = new int[2][sum];
        int ind[] = new int[2];
        ind[0] = 0;
        ind[1] = 0;
        

        int row;
        for (int i=0; i< v.length; i++) {
            if (ind[0] <= ind[1]) {
                row = 0;
            } else {
                row = 1;
            }
            for (int j=0; j<Integer.parseInt(v[i]); j++) {
                rows[row][ind[row]] = i;
                ind[row]++;
            }
        }
        String salida = "";
        salida += "<html><body>";            
        salida += "<TABLE>"; // BORDER=\"1\">";
        for (int k=0; k< 2; k++) {
            salida += "<TR>";
            salida += "<TD>" + "Row " + k + "</TD>";
            for (int i=0; i< ind[k]; i++) {
                salida += "<TD>" + "<img src='http://nicolasserrano.github.io/CS/webapps/auxiliary/images/image" + rows[k][i] + ".png'>" + "</TD>";
            }
            salida += "</TR>";
        }
        salida += "</TABLE>  <p align=\"center\">";
        salida += "</body></html>";            
        return salida;
    }
}