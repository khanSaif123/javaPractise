package patternProblem;

// public class square {

//   public static void main(String args[]){
//     int starPrint = 5;
//     int lines = 4;

//     for(int lineCount = 0; lineCount < lines; lineCount++){
//       String stars = "";

//       for(int i = 0; i < starPrint; i++){
//         stars = stars + "*";
//       }

//       System.out.println(stars);
//     }
//   }

// }

public class square {
  public static void main(String args[]) {
    int rows = 4;
    int cols = 5;
    for(int i=1; i<=rows; i++){
      for(int j=1; j<=cols; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}