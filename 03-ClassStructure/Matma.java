public class Matma {
    static int largerOfTwoNumber(int x, int y) {
        return Math.max(x,y);
    }

    static double piNumber() {
        return Math.PI;
    }
    

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
}
