package array.level1;

import java.util.Scanner;

/**
 * findNumPrintIndex
 */
public class findNumPrintIndex {

    public static void main() {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        int size = 5;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Find this number :");
        int findNum = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == findNum) {
                System.out.println("Index of findNum num is -> " + i);
            }

        }
        System.out.println("The given findNum is not in the array.");

    }

}