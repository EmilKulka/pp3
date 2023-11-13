public class Matma {
<<<<<<< HEAD
    static float largerOfTwoNumbers(float a, float b) {
        return Math.max(a, b);
=======
    static int largerOfTwoNumber(int x, int y) {
        return Math.max(x,y);
>>>>>>> af63efe437d3c64158790ede3b8cf6d608e590aa
    }

    static double piNumber() {
        return Math.PI;
    }
<<<<<<< HEAD

    static float absoluteValue (float a) {
        return Math.abs(a);
    }

    static double squareRoot (double a) {
        return Math.sqrt(a);
    }

    static double randomNumber() {
        return  (Math.random());
    }

    static int randomNumberInRange() {
        return (int) (Math.random() * 11);
    }
    
    static double sinOf(double angle) {
        return Math.sin(angle);
    }

=======
    

    static int absoluteValue(int x) {
        return Math.abs(x);
    }

    static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    static double randomNumber() {
        return Math.random();
    }

    static double randomNumberInRange() {
        return (int) (Math.random() * 11);
    }

    static double sinOfXDegrees(double x) {
        return Math.sin(x);
    }


    public static void main(String[] args) {
        System.out.println(Matma.largerOfTwoNumber(34, 49));
        System.out.println(Matma.piNumber());
        System.out.println(Matma.absoluteValue(-17));
        System.out.println(Matma.squareRoot(9.0/2.0));
        System.out.println(Matma.randomNumber());
        System.out.println(Matma.randomNumberInRange());
        System.out.println(Matma.sinOfXDegrees(90));
    }       
>>>>>>> af63efe437d3c64158790ede3b8cf6d608e590aa
}
