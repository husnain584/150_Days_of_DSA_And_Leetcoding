public class Min_max_InArray {
    public static void main(String[] args) {
        int[] array = {23,34,12,234,2,3,45};

        System.out.println("the min num is : " + min(array));
        System.out.println("the max num is :" + max(array));

    }

    // to find minimum number in array;
    static  int min(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return  min;
    }
    // to find minimum number in array;
    static  int max(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return  max;
    }
}
