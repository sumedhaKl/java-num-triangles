import java.util.Arrays;

public class ArrayFunctions {
    public static String[] newArray(int size, String fillString) {
        String[] newArray = new String[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = fillString;
        }
        return newArray;
    }
    public static int[] printEvens(int[] inputNums) {
        int[] printEvens = new int[inputNums.length];
        int evenCount = 0;
        for (int num : inputNums) {
            if (num % 2 == 0) {
                printEvens[evenCount] = num;
                evenCount++;
            }
        }
        return Arrays.copyOf(printEvens, evenCount);
    }
    public static int[] resizeArray(int[] originalArray) {
        int[] newArray = new int[originalArray.length * 2];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
    String[] testArr = newArray(4, "test");
    System.out.println(Arrays.toString(testArr));

    int[] originalNumsForEvens = {2, 2, 6, 6, 6};
    int[] result = printEvens(originalNumsForEvens);
    System.out.println(Arrays.toString(result));

    int[] nums = {1, 2, 3};
    int[] resizedNums = resizeArray(nums);
    System.out.println(Arrays.toString(resizedNums));
    }
}
