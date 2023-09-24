import java.util.Arrays;
import java.util.spi.AbstractResourceBundleProvider;

public class sortColors {

//    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color
//    are adjacent, with the colors in the order red, white, and blue.
//    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//    You must solve this problem without using the library's sort function.
    public static void main(String[] args) {
        int[] array = {2,0,2,1,1,0};
        bublesortcolor(array);
        System.out.println(Arrays.toString(array));
    }
    public  static void bublesortcolor(int[] array){
        boolean swaped;
        for (int i = 0; i < array.length ; i++) {
            swaped = false;
            for (int j = 1; j < array.length   ; j++) {
                if (array[j] < array[j-1]){
                    swap(array , j , j-1);
                    swaped = true;
                }
            }if (!swaped){
                break;
        }
        }
        }

    static void swap(int[] array , int first , int second){
        int tem = array[first];
        array[first]  =array[second];
        array[second] = tem;
    }

}
