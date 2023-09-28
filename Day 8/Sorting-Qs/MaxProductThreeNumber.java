public class MaxProductThreeNumber {
//    Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
public static void main(String[] args) {
   int[] array  = {1,2,3,4,-2,-6};
    System.out.println(Maxproduct(array));
}
static int Maxproduct(int[] array){
    for (int i = 0; i < array.length; i++) {
        for (int j = i; j > 0; j--) {
            if (array[j] > array[j - 1]) {
                swap(array, j, j - 1);
            } else {
                break;
            }
        }
    }
    int n = array.length;
    int ans1 = array[0]*array[1]*array[2];
    int ans2 = array[n - 1] * array[n-2] * array[0];
    return Math.max(ans1 , ans2);
}
    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}





//    public class MaxProductThreeNumber {
//        public static void main(String[] args) {
//            int[] array = {1, 2, 3, 4, -2, -6};
//            System.out.println(Maxproduct(array));
//        }
//
//        static int Maxproduct(int[] array) {
//            int n = array.length;
//
//            for (int i = 0; i < n; i++) {
//                for (int j = i; j > 0; j--) {
//                    if (array[j] > array[j - 1]) {
//                        swap(array, j, j - 1);
//                    } else {
//                        break;
//                    }
//                }
//            }
//
//            int ans1 = array[n - 1] * array[n - 2] * array[n - 3]; // Product of the three largest numbers
//
//            return ans1;
//        }
//
//        public static void swap(int[] array, int first, int second) {
//            int temp = array[first];
//            array[first] = array[second];
//            array[second] = temp;
//        }
//    }

