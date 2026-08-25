package array.level1;

public class pairSum {
    public static void main() {
        int arr[] = { 2, 7, 11, 9 };
        int target = 11;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                }
            }
        }
    }
}
