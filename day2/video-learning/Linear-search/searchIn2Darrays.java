import java.util.Arrays;

public class searchIn2Darrays {
    public static void main(String[] args) {
        int [][] arr = {
                {23,44,12},
                {21,1,2,27},
                {25,34,1}
        };
        int target = 27;

        int ans[] = array2d(arr , target);


        System.out.println(Arrays.toString(ans));
    };
    static  int[] array2d(int[][] array, int target){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                   if (array[i][j] == target){
                       return new int[] {i , j} ;
                   }
            }
        }
      return new int[] {-1,-1};
    }
}
