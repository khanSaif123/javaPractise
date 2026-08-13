package patternProblem;

public class halfInvertedPyramid {
    public static void main(String args[]) {
        int rowCount = 5;
        int colCount = 4;
        for(int i=1; i <= rowCount; i++){
           for(int j=colCount; j>=i; j--){
            System.out.print("*");
           }
           System.out.println();
        }
    }
}
