package first_code;

import java.util.Scanner;

public class tellYearCleanWay {
    public static void main(String[] args){

        String[] month = {
            "January", "Feb", "March", "April", "May", "June", "July",
            "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        Scanner sc = new Scanner(System.in);

        int monthNumber = sc.nextInt();

        if(monthNumber >= 1 && monthNumber <= 12){
            String monthVal = month[monthNumber - 1];
            System.out.println(monthVal);
        }else{
            System.out.println("Invalid month number");
        }
    }
}
