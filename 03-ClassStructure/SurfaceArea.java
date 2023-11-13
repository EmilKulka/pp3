public class SurfaceArea {
    static float rectangle(float a, float b) {
        return a * b;
    }

    static double circle(double radius) {
        return  Math.PI *  Math.pow(radius,2);
    }

    static double triangle(double a, double height) {
        return 0.5 * (a * height);
    }

    static double cuboid(double length, double height, double width) {
        return 2 * (length + height + width);
    }

    static double sphere(double radius) {
        return (4 * (Math.PI) ) * Math.pow(radius,2);
    }

    static double cone(double radius, double slantHeight) {
        return (Math.PI * Math.pow(radius,2)) + (Math.PI * radius * slantHeight);
    }
}
