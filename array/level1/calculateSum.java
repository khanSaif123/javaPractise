package array.level1;

public class calculateSum {
    public static void main(){
        int sum = 0;
        int arr [] = {1, 23, 46, 10};

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum = " + sum);
    }
}
