import java.util.Arrays;

public class mediumQs {
    public static void main(String[] args){

    }
    static int[] searchRange(int[] nums ,int  target) {

        int[] ans = {-1, -1};
        int first = orderAgnostic(nums, target, true);
        int last = orderAgnostic(nums, target, false);

        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    static int orderAgnostic(int[] array, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
