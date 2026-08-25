package array.level1;

public class allOccurance {
    public static void main(){
        int arr [] = {10, 20, 30, 10};
        int search = 10;

        for(int i=0; i<arr.length; i++){
            if(search == arr[i]){
                System.out.println(search + " Found at index " + i);
            }
        }
    }
}
