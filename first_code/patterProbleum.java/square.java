
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
    int starPrint = 5;
    int lines = 4;
    String star = "";
    int lineCount = 1;

    while (lineCount <= lines) {

      for (int i = 0; i < starPrint; i++) {
        if (star.length() < starPrint) {
          star = star + "*";
        }
      }
      lineCount++;
      System.out.println(star);

    }
  }
}