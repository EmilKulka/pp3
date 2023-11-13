public class MyArrays {
    
    public static int odd(int[] array) {
        int sum = 0;
        for(int value:array) {
            if(value > 0 && value % 2 != 0) {
                sum ++;
            }
        }
        return sum;
    }

    public static int above(int[] array) {
        int sum = 0;
        for(int value:array) {
            sum += value;
        }
        int arithmeticMean = sum / array.length;
        int numberToReturn = 0;

        
        for (int value:array) {
            if(value > arithmeticMean) {
                numberToReturn += value;
            }
        }
        return numberToReturn;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,2,-5,4,1,-7};
        int[] arr2 = {5,2,7,4,2};
        System.out.println(MyArrays.odd(arr1));
        System.out.println(MyArrays.above(arr2));

    }
}
