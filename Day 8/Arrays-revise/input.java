import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // fill the array using for loop

//        // take input from user
//        Scanner in = new Scanner(System.in);
//
//        int[] arr = new int[5];
//
//        for (int i = 0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        for (int i = 0 ; i<arr.length; i++){
//            System.out.print(arr[i] + "");
//        }

        // for more underStanding make an array and fill this array accordig to user need;

        Scanner in = new Scanner(System.in);
//        int[] arr = new int[3];

//        for (int i = 0 ; i< arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        for (int i = 0 ; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        // to print this array we can also use enhanced for loop

//        for (int num: arr){
//            System.out.println(num);
//        }

        // the othe simple method to print this array is ;

//        System.out.println(Arrays.toString(arr));

        // let's talk about object array  . previouly we talk about primitives;

        String[] str = new String[3];

        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
