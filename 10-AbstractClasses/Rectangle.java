public class Rectangle extends Shape {  
    double a,b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a*b;
    }
    
}
