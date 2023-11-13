public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX() {
        if(y == 0) {
            return true;
        }
        return false;
    }

    public boolean isY() {
        if(x == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("P(%d,%d)",x, y);
    }

    public static void main(String[] args) {
        Point Point = new Point(3,0);
        System.out.println(Point.isX()); 
        System.out.println(Point.isY());
        System.out.println(Point.toString());

        //wyniki z pliku są nieprawidłowe.
    }
}
