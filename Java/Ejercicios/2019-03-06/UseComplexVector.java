import java.util.Vector;
public class UseComplexVector {
    public static void main(String[] args) {
        Vector<Complex> vec = ToolVector.createVector(args);
        int n = vec.size();
        Complex sum = new Complex(0, 0);
        for (int i = 0; i < n; i++) {
            sum = sum.plus(vec.elementAt(i));
        }
        System.out.println("Sum: " + sum);
    }
}