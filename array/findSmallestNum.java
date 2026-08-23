package array;

import java.util.Scanner;

public class findSmallestNum {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr [] = new int[size];

        System.out.println("Enter the values of the array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];

        System.out.println("Finding the smallest value among the values u enter.....");
        for(int i=1; i<size; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }else{
                smallest = smallest;
            }
        }

        System.out.println("Found it");
        System.out.println("The smallest value is : " + smallest);
    }
}
