import java.awt.Color;
//import Jama.Matrix;

class PanelWeb extends Panel {

    public PanelWeb (int filas, int columnas) {
        super(filas, columnas);
    }
    public String outputHTML() {
        StringBuffer res = new StringBuffer("");
        res.append("<HTML><HEAD><TITLE> Temperaturas del panel </TITLE><BODY>");
        res.append("<TABLE border=1>");
        for (int i = 0;i < this.filas ; i++) {
            res.append("<TR>");
            for (int j = 0;j < this.columnas ; j++) {
                int intresultado = (int)celdas[i][j].resultado;
                if ((intresultado) > (255 - 85)) {
                    int hex = (int)(255 - celdas[i][j].resultado);
                        res.append("<TD bgcolor=\"" + Integer.toHexString(new Color(0xff,
                        hex * 255 / 85, 0x00).getRGB()).substring(2, 8) + "\" >" +
                        intresultado + "</TD>");
                } else if ((intresultado) > (85)) {
                    int hex = (int)(255 - 85 - celdas[i][j].resultado);
                    res.append("<TD bgcolor=\"" + Integer.toHexString(new Color(0xff,
                        0xff, hex * 255 / 85).getRGB()).substring(2, 8) + "\" >" +
                        intresultado + "</TD>");
                } else {
                    int hex = (int)(celdas[i][j].resultado);
                    res.append("<TD bgcolor=\"" + Integer.toHexString(new Color(hex * 255 / 85,
                        0xff, 0xff).getRGB()).substring(2, 8) + "\" >" +
                        intresultado + "</TD>");
                }
            }
            res.append("</TR>");
        }
        res.append("</TABLE>");
        res.append("</BODY></HTML>");
        String stringRes = new String(res);
        return stringRes;
    }
}
