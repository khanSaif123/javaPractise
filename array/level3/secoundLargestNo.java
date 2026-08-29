package array.level3;

import java.util.Arrays;

public class secoundLargestNo {
    public static void main(String[] args) {
        int arr [] = {10, 40, 30, 20, 50, 60};

        Arrays.sort(arr);
        System.out.println("Second largest number: " + arr[arr.length - 2]);
    }
}
