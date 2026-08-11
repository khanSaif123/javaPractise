package patternProblem;

public class halfInvertedPyramid {
    public static void main(String args[]) {
        int rowCount = 5;
        int colCount = 4;
        for (int row = 1; row <= rowCount; row++) {

            for (int col = colCount; col >= row; col--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
