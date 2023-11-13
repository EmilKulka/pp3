import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray {
    static int even(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum ++;
            }
        }
        return sum;
    }

    static int positiveOdd(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] > 0) {
                sum ++;
            }
        }
        return sum;
    }

    static int[] reverse(int[] array) {
        int[] finalArray = new int[array.length];
        for (int i = array.length -1; i >= 0; i--) {
            finalArray[array.length -1 - i] += array[i];
        }
        return finalArray;
    }

    static boolean compare(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static int[] different(int[] array1, int[] array2) {
        List<Integer> result = new ArrayList<>();

        for (int num : array1) {
            if (!contains(array2, num)) {
                result.add(num);
            }
        }

        // Convert the ArrayList to an array
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {                   //nic nie rozumiem
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    // Function to check if a number is in an array
    public static boolean contains(int[] array, int num) {
        for (int element : array) {
            if (element == num) {
                return true;
            }
        }
        return false;
    }

    static boolean exist(int number, int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == number) {
                return true;
            }
        }
        return false;
    }

    static int secondMax(int[] array) {
        Arrays.sort(array);
        return array[array.length -2];
    }

    static int lastColumn(int[][] array) {
        int sum = 0;

        for(int i = 0; i < array.length; i++) { 
            int lastColumnIndex = array[i].length -1;
            sum += array[i][lastColumnIndex];
        }
        return sum;
    }

    static int[][] swap(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            int lastColumnIndex = array[i].length -1;
            int firsElement = array[i][0];
            array[i][0] = array[i][lastColumnIndex];
            array[i][lastColumnIndex] = firsElement;
        }
        return array;
    }

    static ArrayList<Integer> two2one(int[][] array) {
        ArrayList<Integer> oneDArray = new ArrayList<>();

        for(int i = 0; i < array.length ; i++) {
            for(int j = 0; j < array[i].length;j++) {
                oneDArray.add(array[i][j]);
            }
        }
        
        return oneDArray;
    }

    
    

    public static void main(String[] args) {
        int[][] array2 = {{3, 5, 4, 7, 6},{1, 2, 3, 4, 5}};

        System.out.println(MyArray.two2one(array2));
}
}