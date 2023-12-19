public class Triangle extends Shape {
    double a,b,c;

    public Triangle(double a, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double area() {
        return (a+b+c) / 2;
    }


}
