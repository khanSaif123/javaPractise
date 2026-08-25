package array.level1;

public class oddEvenCount {
    public static void main(){
        int evenCount = 0;
        int oddCount = 0;

        int arr[] = {20, 30, 36, 77, 11, 63, 10};

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);

    }
}
