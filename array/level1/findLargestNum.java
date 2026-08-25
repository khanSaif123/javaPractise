package array.level1;

import java.util.Arrays;
import java.util.Scanner;

public class findLargestNum {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int arr [] = new int[size];
        int largest = 0;

        System.out.println("Enter the values of array:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Enter this array: " + Arrays.toString(arr));

        for(int i=0; i<size; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }else{
                largest = largest;
            }
        }
        System.out.println("Largest number in the array is : " + largest);
    }
    
}
