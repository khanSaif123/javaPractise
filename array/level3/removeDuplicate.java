package array.level3;

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 40};
        int newArray [] = new int[arr.length];

        int i = 0;
        int p = arr[arr.length - i - 1];
        while(i < arr.length - 1){
            if(arr[i] != arr[p]){
                newArray[i] = arr[p];
                i++;
                p = arr[arr.length - i - 1];
            }else{
                i++;
                p = arr[arr.length - i - 1];
            }
        }
        
        System.out.println("new array without duplicate element is -> " + Arrays.toString(newArray));
    }
}
