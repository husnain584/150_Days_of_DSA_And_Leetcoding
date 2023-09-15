public class targetInMountainArray {
    public static void main(String[] args) {

        // you have a mountain array tou just find the given target element and return the index;

        int[] array = {1,2,4,5,4,3,2};
         int target = 3;

        System.out.println(search(array,target));
    }

    static  int search(int[] array , int target){
        int peek = peakIndexInMountainArray(array);

       int first = orderIgnostic(array , target ,0,peek);

       if (first != -1){
           return first;
       } return orderIgnostic(array , target , peek+1,array.length-1);
    }
    static  int orderIgnostic(int[] array , int target,int start , int end){
        while ( start <= end){
            if (array[0] < array[array.length-1]){
                int mid = (start + end) / 2 ;
                if (target < array[mid]){
                    end = mid - 1;
                }else if (target> array[mid]){
                    start = mid + 1;
                }else {
                    return  mid;
                }
            }
            if (array[0] > array[array.length-1]){
                int mid = (start + end) / 2 ;
                if (target < array[mid]){
                    end = mid + 1;
                }else if (target> array[mid]){
                    start = mid - 1;
                }else {
                    return  mid;
                }
            }
        }
        return -1;
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
