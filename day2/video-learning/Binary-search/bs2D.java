import java.util.Arrays;

public class bs2D {
    public static void main(String[] args) {
        // let's take an example of sorted two 2D array : array is sorted by row and column wise;

        int[][] array = {
                {10,20,30,40},
                {15,25,35,45},
                {20,26,37,48}
        };

        int target = 35;

        System.out.println(Arrays.toString(darray(array,target)));
    }

    static  int[] darray(int[][] array ,int target){
       int row = 0;
       int col = array.length-1;

       while (row< array.length && col >= 0){
           if (target < array[row][col] ){
               col--;
           }else if (array[row][col] == target){
               return new int[]{row,col};
           }else {
               row++;
           }
       }
 return new int[] {-1,-1};
    }
}
