package loop;

import java.util.Scanner;

public class whileLoop {
    public static void main(String arg[]){
        // int counter = 0;

        // while(counter <= 10){
        //     System.out.print(counter + " ");
        //     counter++;
        // }

        // Take number n from user and print number from 1 to n.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        while(count <= n){
            System.out.print(count + " ");
            count++;
        }
    }
}
