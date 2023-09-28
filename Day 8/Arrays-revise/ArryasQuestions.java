import java.util.Arrays;
import java.util.Scanner;

public class ArryasQuestions {
    public static void main(String[] args) {
       // create an array of five floats and calculate their sum write a program in java

//        float[] array = {1,3,7};
//
//       int sum = 0;
//        for (int i = 0; i < array.length ; i++) {
//            sum += array[i];
//        }
//        System.out.println(sum);


        // Q no 2 write a program in java to find out the given integer is present in given array or not and if present show its locaiton


//        int[] array1 = {1,55,3};
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter the number to find it");
//        int newNumber = in.nextInt();
//
//        for (int i = 0; i <array1.length ; i++) {
//            if (newNumber == array1[i]){
//                System.out.println("found this number on index"+ " "+ i );
//            }
//            else {
//                System.out.println("not found"); }
//        }


        // Question no 3 ; Create a java program to add two matrix of sixe 2,3;

//        int[][] mat1 = {{1,2,3},
//                        {4,5,6}};
//        int[][] mat2 = {{4,8,3},
//                       {12,5,21}};
//
//        int[][] result = {{0,0,0},{0,0,0}};
//
//        for (int i = 0; i < mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length ; j++) {
//               result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//
//        }
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length ; j++) {
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println();
//
//        }


                   // Question no 4 ; write a program to reverse an array;

//         int[] array = {1,2,3,4};
//         int length = array.length;
//
//         int n = Math.floorDiv(length,2);
//
//        int temp;
//
//        for (int i = 0; i < n; i++) {
//            temp = array[i];
//            array[i] = array[length-i-1];
//            array[length-i-1] = temp;
//        }
//        System.out.println(Arrays.toString(array));



                 // question no 5 ; find the min element in an array;

//        int[] array = {1,2,-2};
//
//        int max = array[0];
//
//
//        for (int i = 0; i < array.length ; i++) {
//            if(array[i] < max){
//                max = array[i];
//            }
//            if (array == null || array.length == 0) {
//                throw new IllegalArgumentException("Array is empty or null.");
//            }
//        }
//        System.out.println(max);


//       Question no 8; given array is sorted or not

        Scanner in = new Scanner(System.in);
         int arr = in.nextInt();
        int[] array = new int[arr];

        boolean sortedarray = true;

        for (int i = 0; i < array.length ; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length-1 ; i++)
            if (array[i] > array[i + 1]) {
                sortedarray = false;
            }else{
                sortedarray = true;
            }

        System.out.println(sortedarray);

    }
}
