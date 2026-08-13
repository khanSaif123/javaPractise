package patternProblem;

public class hollowPattern {
    public static void main(String args[]){
       int firstRow = 1;
       int lastRow = 5;
       int firstCol = 1;
       int lastCol = 4;

       for(int i=1; i<=lastRow; i++){
         for(int j=1; j <= lastCol; j++){
            if(i == firstRow || i == lastRow || j == firstCol || j == lastCol){
               System.out.print("*");
            }else{
                System.out.print(" ");
            }
         }
         System.out.println();
       }
    }
}