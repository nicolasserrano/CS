public class UseRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 3);
        System.out.println("Area: " + r1.area());
        Rectangle r2 = new Rectangle(Float.parseFloat(args[0]), Float.parseFloat(args[1]));
        System.out.println("Area: " + r2.area());
    }
}