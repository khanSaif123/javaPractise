// print fibonachi series.

package functions;

public class question4 {
   public static void main(String args[]){
     int a = 0;
     int b = 1;

     int next = 0;
     int n = 10;
     System.out.print(a);
     System.out.print(b);
     for(int i=1; i<=n; i++){
       next = a + b;
       System.out.print(next);
       a = b;
       b = next;
     }
   }
}