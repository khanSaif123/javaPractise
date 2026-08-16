package functions;

import java.util.Scanner;

public class question3 {
    public static void findGreater(int a, int b){
        if(a > b){
             System.out.println("A is greater : " + a);
        }
        else if( a < 0){
            System.out.println("B is greater: " + b);
        }else if(b < 0){
            System.out.println("A is greater: " + a);
        }
        else{
            System.out.println("B is greater : " + b);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        findGreater(num1, num2);
    }
}
