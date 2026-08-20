package array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * firstArray
 */
public class firstArray {

    public static void main(){
        // how to declare array.
        // type[] arrayName = new type[size].
        int [] masks = new int[3];
        int num [] = {};
        masks[0] = 20;
        masks[1] = 50;
        masks[2] = 45;

        // System.out.println(masks[0]);
        // System.out.println(masks);
        // System.out.println(Arrays.toString(masks));
        for(int i=0; i< masks.length; i++){
            System.out.print(masks[i]+" ");
        }
    }
}