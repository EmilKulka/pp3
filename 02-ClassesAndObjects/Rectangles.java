public class Rectangles {
    float a,b;

    void rectangleInfo() {
        System.out.println(a+"x"+b);
        System.out.println((2*a) + (2*b));
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        Rectangles rect1 = new Rectangles();
        rect1.a = 3;
        rect1.b = 4;
        rect1.rectangleInfo();

        Rectangles rect2 = new Rectangles();
        rect2.a = 2;
        rect2.b = 7;
        rect2.rectangleInfo();
    }
}
