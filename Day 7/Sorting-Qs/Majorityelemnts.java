public class Majorityelemnts {
//    Given an array nums of size n, return the majority element.
//
//    The majority element is the element that appears more than ⌊n / 2⌋ times.
//    You may assume that the majority element always exists in the array.
public static void main(String[] args) {
    int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
    majorityElement(nums);
    int middle = nums.length / 2;
    System.out.println(nums[middle]);


}
        public static void majorityElement(int[] nums) {
    // here's is use inserton sort to sort an array;

            for (int i = 0; i < nums.length - 1 ; i++) {
                for (int j = i + 1; j > 0 ; j--) {
                    if(nums[j] < nums[j - 1]){
                        swap (nums , j , j - 1);
                    }else {
                        break;
                    }
                }
            }

        }
    public static void  swap ( int [] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second ] = temp;
    }

}
