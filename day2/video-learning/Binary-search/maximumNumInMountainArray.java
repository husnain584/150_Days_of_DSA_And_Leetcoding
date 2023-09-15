public class maximumNumInMountainArray {


    // you have mountain array your target is to find the maximum number in an array ;
    public static void main(String[] args) {

        int[] array = {1,2,4,5,6,3,2,1};

        System.out.println(peakIndexInMountainArray(array));

    }
    static    int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+ 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
      return start;
    }
}
