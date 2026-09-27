import java.util.Arrays;

public class Solution {
    public static int[] insertElement(int[] arr, int index, int value) {
        int n = arr.length;
        int[] newArr = new int[n + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        return newArr;
    }

    // Added main method to run and test the solution
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int index = 2;
        int value = 99;

        int[] result = insertElement(arr, index, value);

        // Output: [10, 20, 99, 30, 40]
        System.out.println(Arrays.toString(result));
    }
}