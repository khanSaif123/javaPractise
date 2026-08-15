// package addvancedPattern;

// public class betterflyPattern {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= 4 - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

package addvancedPattern;

public class betterflyPattern {
    public static void main(String args[]) {
      int n = 4;
      for(int i=1; i<=n; i++){
        // left stars
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        // middle space.
        for(int j=1; j<= 2*(n - i); j++){
            System.out.print(" ");
        }

        // right stars
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        

         System.out.println();
      }
    }
}