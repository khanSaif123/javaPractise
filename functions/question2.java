// Write a function to print the sum of all odd numbers from 1 to n;

package functions;

import java.util.Scanner;

public class question2 {

    public static void getSumOfOddNumber(int num){
        int sum = 0;
        for(int i=1; i<=num; i++){
            if(i%2 != 0){
                sum = sum + i;
            }else{
                sum = sum;
            }
        }

        System.out.print(sum);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        getSumOfOddNumber(num);
    }
    
}
