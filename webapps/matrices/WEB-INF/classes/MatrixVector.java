import java.util.*;
import Jama.*;

public class MatrixVector {
    public static Vector<Matrix> v = new Vector<Matrix>();

    public static String printMatrix(Matrix m) {
        String out = "";
        out += "<TABLE border=1>";
        for (int i=0; i< m.getRowDimension(); i++) {
            out += "<TR>";
            for (int j=0; j< m.getColumnDimension(); j++) {
                out += "<TD>" + m.get(i,j) + "</TD>";
            }
            out += "</TR>";
        }
        out += "</table>";
        return out;
    }

    public static String printMatrices(String name) {
        String out = "";
        out += "<TABLE border=0>";
        for(int i=0; i<v.size(); i++){
            out += "<TR>";
            out += "<TD>";
            out +="<H2 align=\"center\">";
            if (name != null) {
                out +="<INPUT type=\"radio\" name=\"" + name + "\" value=\"" + i + "\">";
            }
            out += "Matriz " + i + "</H2>";
            Matrix m = v.elementAt(i);
            out += "<p align=\"center\">";
            out += printMatrix(m);
            out += "</TD>";
            out += "</TR>";
        }
        out += "</table>";
        return out;
    }

}