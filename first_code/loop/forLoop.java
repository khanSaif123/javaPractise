package loop;

public class forLoop {
    // print number from 0 to 10.
    public static void main(String args[]){
        // for(int i=0; i<=10; i++){
        //     System.out.print(i+" ");
        // }

        // print sum of n natural numbers.
        int sum = 0;
        int n = 4;
        for(int i=0; i <=n; i++){
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
