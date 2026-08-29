package array.level3;

public class copyOneArrayIntoAnother {
    public static void main(String[] args) {
        int arr [] = {10, 20, 30, 40, 50};
        int reverseArray [] = new int [arr.length];

        for(int i=0; i<arr.length; i++){
            reverseArray[i] = arr[i];
        }
        
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(reverseArray[i]+ " ");
        }
    }
}
