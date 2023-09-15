public class targetInArray {
    // question is find the target element in sorted array but u not know the size of the array means in infinite array
    public static void main(String[] args) {
        
    }
    // here we don't know the size of array so we don't know the firs ans start 
    // that's why we move in chunks
    static  int findElemnt(int[] array ,int target){
        int start = 0;
        int end = 2;

        while (start<=end){
            int mid = start + (end - start) / 2;

            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else if (target != array[mid]) {
                start = end + 1;
                end = start + end*2;
            }
        }
        return start;
    }
}
