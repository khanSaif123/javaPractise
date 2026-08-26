package array.level2;

import java.util.Scanner;

public class lenearSearch {
    public static void main() {
        // lenear search.
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Now enter the values of array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number that u want to search inside the array: ");
        int search = sc.nextInt();

        System.out.println("Searching the value inside the array: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
              found = true;
              break;
            }
        }

        if(found){
            System.out.println(search + " is found in the array.");
        }else{
            System.out.println(search + " is not found in the array.");
        }

    }
}
