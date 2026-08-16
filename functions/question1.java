// Question -> Enter 3 number from the user & make a function to print there average.

package functions;

import java.util.Scanner;

public class question1 {

    public static int calAverage(int a, int b, int c){
        int average = a + b + c / 3;
        return average;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = calAverage(a, b, c);
        System.out.println("Average of 3 number = " + ans);
    }
}
