package array.level3;

/**
 * reverseArray
 */
public class reverseArray {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        System.out.println(arr.length);

        for(int i=arr.length - 1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}