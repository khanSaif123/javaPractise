package patternProblem;

public class invert180DegreerotatedPyramid {
    public static void main(String[] args) {

        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            // first print space.
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // print stars.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // print next line.
            System.out.println();
        }

    }
}
