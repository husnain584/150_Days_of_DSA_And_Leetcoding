public class Arrays {
    public static void main(String[] args) {
        int[] array = {1,4,2,3};

        int target = 6;

        for (int i = 0; i <array.length ; i++) {
            for (int j = array.length-1; j < 0; j--) {
                int ans = array[i]+array[j];

                if (ans == target){
                    System.out.println(array[i] + array[j]);
            }

            }
        }
    }
}
