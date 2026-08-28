package array.level2;

class countAllOccurance {
    public static void main(String[] args) {
        int search = 20;
        int arr [] = {10, 20, 30, 20, 10, 20};

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == search){
                count++;
            }
        }

        System.out.println(search + " appears " + count + " times");
    }
}