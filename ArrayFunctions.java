import java.util.Arrays;

public class ArrayFunctions {
    public static String[] newArray(int size, String fillString) {
        String[] newArray = new String[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = fillString;
        }
        return newArray;
    }
    public static void printEvens(int[] inputNums) {
        StringBuilder sb = new StringBuilder();
        for (int num : inputNums) {
            if (num % 2 == 0) {
                sb.append(num);
            }
        }
        System.out.println(sb.toString());
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

    int[] newNums = {2,6,6,6,1,3,5};
    printEvens(newNums);

    int[] nums = {1, 2, 3};
    int[] resizedNums = resizeArray(nums);
    System.out.println(Arrays.toString(resizedNums));
    }
}
