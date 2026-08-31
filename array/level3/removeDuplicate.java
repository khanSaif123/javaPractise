package array.level3;

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 40};
        int newArray [] = new int[arr.length];

        int k = 0;
        for(int i=0; i < arr.length; i++){
            boolean duplicate = false;

            for(int j=0; j<k; j++){
                if(arr[i] == newArray[j]){
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate){
                newArray[k] = arr[i];
                k++;
            }
        } 
        
        System.out.println("new array without duplicate element is -> " + Arrays.toString(newArray));
    }
}
