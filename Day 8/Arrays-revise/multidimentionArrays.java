import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class multidimentionArrays {
    public static void main(String[] args) {

        // syntax

     //   int[][] array = new int[number of rows][ number of colums];

        Scanner in = new Scanner(System.in);
        System.out.println("number of rows");
        int row = in.nextInt();
        System.out.println("number of col");
        int col = in.nextInt();


        int [][] array = new int[row][col];

        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                array[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i<row; i++){
            for (int j = 0; j <col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }



    }
}
