import java.util.Arrays;

public class maxIn2Darray {
    public static void main(String[] args) {
        int [][] arr = {
                {23,44,12},
                {21,34,32,27},
                {25,34,23}
        };

        System.out.println(max(arr));
    }
    static int max(int[][] array){
        int max = array[0][0];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
     return  max;
    }
}
