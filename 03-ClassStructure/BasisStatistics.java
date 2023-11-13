public class BasisStatistics {
    static int numberOfItemsInRange(int a, int b) {
        int sum = 0;
        for (int x = a; x < b; x++ )
            sum ++;
        return sum;
    }

    static int sumOfNumberInRange(int a, int b) {
        int sum = 0;
        for (int x = a; x < b; x++ )
            sum += x;
        return sum;
    }

    static int arithmeticMean(int a, int b) {
        if (a == b || a > b) {
            return 0;
        }
        else {
            return BasisStatistics.sumOfNumberInRange(a, b) / BasisStatistics.numberOfItemsInRange(a, b);
        }
    }

    public static void main(String[] args) {
        System.out.println(BasisStatistics.arithmeticMean(5, 10));
    }
}
