package array.level1;

import java.util.Scanner;

public class average {
    public static void main(){
       Scanner sc = new Scanner(System.in);

       int count = 0;
       int average = 0;

       System.out.println("Enter the size of the array : ");
       int size = sc.nextInt();

       int arr [] = new int[size];
       System.out.println("Now enter the values in array: ");
       for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
       }

       System.out.println("Calculating the average.... ");
       for(int i=0; i<size; i++){
          count = count + arr[i];
       }

       average = count/size;
       System.out.println("The average is: " + average);

    }
}
