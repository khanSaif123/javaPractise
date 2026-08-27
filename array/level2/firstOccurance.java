package array.level2;

public class firstOccurance {
    public static void main() {
        int arr[] = { 20, 10, 20, 30, 10 };
        int search = 10;
        boolean firstOcc = false;
        int firstOccVal = 0;

        for (int i = 0; i < arr.length; i++) {

            if (!firstOcc) {
                if (search == arr[i]) {
                    firstOcc = true;
                    firstOccVal = i;
                }
            }
        }

        if (firstOcc) {
            System.out.println("Index of first occ of " + search + " is " + firstOccVal);
        }

    }
}
