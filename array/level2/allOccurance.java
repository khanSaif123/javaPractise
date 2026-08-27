package array.level2;

class allOccurance {
   public static void main() {
      int arr [] = {10, 20, 10, 30, 10};
      int search = 10;

      for(int i=0; i<arr.length; i++){
        if(arr[i] == search){
            System.out.println(search + " found at index " + i);
        }
      }
   }
}