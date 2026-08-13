package patternProblem;

public class triAngle {
    public static void main(String args[]) {
        // int noOfLine = 5;
        // String str = "";
        // for (int i = 1; i <= noOfLine; i++) {
        // str = str + "*";
        // System.out.println(str);
        // }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
