import java.util.Vector;
class ToolVector {
    static Vector<Complex> createVector(String [] args) {
        Vector<Complex> v = new Vector<Complex>();
        int n = args.length;
        for (int i=0; i < n; i++) {
            double val = Double.parseDouble(args[i]);
            v.addElement(new Complex(val, -val); 
        }
        return v;
    }
}