public class array2 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};

        if (nums.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int min = nums[0]; // Initialize min with the first element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        int max = nums[0];

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] > max){
                max = nums[i];
            }
        }

        int result = max - min;

        System.out.println(result);

    }
}
