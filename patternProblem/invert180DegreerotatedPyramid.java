package patternProblem;

public class invert180DegreerotatedPyramid {
    public static void main(String[] args) {
        int noOfLines = 4;
        for(int i = 1; i <= noOfLines; i++){
            
            for(int j=1; j <= noOfLines - i; j++){
                System.out.print(" ");
            }

            for(int j=1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
            
        }
    }
}

