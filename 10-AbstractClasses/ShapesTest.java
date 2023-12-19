public class ShapesTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        System.out.println(r1.area());

        Triangle t1 = new Triangle(3, 4);
        System.out.println(t1.area());

        Circle c1 = new Circle(5);
        System.out.println(c1.area());
    }
}
