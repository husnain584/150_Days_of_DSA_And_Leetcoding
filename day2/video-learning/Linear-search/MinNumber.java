public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {23,45,33,5,66,77,12,32};
        System.out.println(min(arr));
    }
    static int min(int[] arr){

        int minimum = arr[0];

        for (int i = 0; i <arr.length; i++) {

            if (arr[i] < minimum){
                minimum = arr[i];
            }
        }
       return minimum;
    }
}
