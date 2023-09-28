
// Qs ;  Take a matrix as input from user and search for a given number X and print its position;


import java.util.Arrays;
import java.util.Scanner;

public class multDQustions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("number of rows");
        int row = in.nextInt();
        System.out.println("number of col");
        int col = in.nextInt();

        int[][] DArray = new int[row][col];

        int x = 11;

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                DArray[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                if (DArray[i][j]== x){
                    System.out.println("the number is found at position (" + i + ", "+ j + ")" );
                }

            }
        }


        // Q:2; create an array of 5 floats and fint their sum;

        float[] Array = {0.4F,3.6F,4.5F};

        float sum = 0;

        for (int i = 0; i <Array.length ; i++) {
              sum = sum + i;
        }
        System.out.println(sum);





    }
}
