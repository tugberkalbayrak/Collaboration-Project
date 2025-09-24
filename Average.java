import java.util.Arrays;

public class Average {
    public static int[] findAverage(int[] intArray) {
        int[] differenceArray = new int[intArray.length];
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        int average = sum / intArray.length;

        for (int i = 0; i < intArray.length; i++) {
            differenceArray[i] = intArray[i] - average;
        }
        
        System.out.println(Arrays.toString(differenceArray));
        return differenceArray;
    }
}
