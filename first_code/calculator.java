// 1 Make a calculator. take 2 number (a and b ) from the user and an operator as follows
// 1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b

package first_code;

import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char oper = sc.next().charAt(0);
        switch (oper) {
            case '*': 
                int ans = a * b;
                System.out.println(ans);
                break;
            case '/':
                System.out.println(a / b);
            
            case '+':
                System.out.println(a + b);
                
            case '-':
                System.out.println(a - b);
            
            case '%':
                if(a == 0){
                    System.out.println("a should greater than 0");
                }else if(a < b) System.out.println("a should greater than b");
                else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

    }
}
