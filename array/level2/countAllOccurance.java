package array.level2;

import java.util.Scanner;

class countAllOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr [] = new int[size];

        System.out.println("Enter the size of the array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value that u want to search in the array: ");
        int search = sc.nextInt();

        for(int i=0; i<size; i++){
            if(arr[i] == search){
                count++;
            }
        }

        System.out.println(search + " appears " + count + " times.");
        
    }
}