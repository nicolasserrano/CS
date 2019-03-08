import java.util.Vector;
public class CirculoVector {
    public static void main(String[] args) {
        Vector<Circulo> vec = new Vector<Circulo>();
		int n = args.length;
		for (int i=0; i < n; i++) {
			vec.addElement(new Circulo(Double.parseDouble(args[i]))); 
		}
		//System.out.println("Size: " + vec.size());
		System.out.println(vec.elementAt(Integer.parseInt(args[n-1])));
    }
}