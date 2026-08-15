package functions;

import java.util.Scanner;

public class factorial {

    public static int calFactorial(int number){
        int factorial = 1;
        for(int i=number; i>=1; i--){
           factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int nummber = sc.nextInt();

        int ans = calFactorial(nummber);
        System.out.println(ans);

    }
}
