package array.level2;

public class lastOccurance {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30};
        int lastOcc = 0;
        int search = 10;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == search){
               lastOcc = i;
            }
        }

        System.out.println("Last occ of index " + lastOcc);
    }
}
