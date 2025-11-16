import java.util.Arrays;

public class ArrayFunctions {
    public static String[] newArray(int size, String fillString) {
        String[] newArray = new String[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = fillString;
        }
        return newArray;
    }
    public static int[] printEvens() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] printEvens = new int[nums.length];
        int evenCount = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                printEvens[evenCount] = num;
                evenCount++;
            }
        }
        return Arrays.copyOf(printEvens, evenCount);
    }
    public static void main(String[] args) {
    String[] testArr = newArray(4, "test");
    System.out.println(Arrays.toString(testArr));
    int[] result = printEvens();
    System.out.println(Arrays.toString(result));
    }
}
