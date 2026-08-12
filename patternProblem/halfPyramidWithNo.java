package patternProblem;

import java.util.Scanner;

public class halfPyramidWithNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        // this outer loop is for printing no. of rows.
        for (int i = 1; i <= rows; i++) {

            // this loop is for no. of cols.
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // for next line.
            System.out.println();
        }
    }
}
