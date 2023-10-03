public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,54,65,76};
        int target = 76;
        System.out.println(rec(array,target,0,array.length-1));

    }
    static  int rec(int[] array, int target , int start , int end){
        if (start > end){
            return -1;
        }
        // find the middle element in the array;
        int mid = start +  (end - start)/2;
        // three conditions;
        if (array[mid] == target){
            return mid;
        }
        if (target < array[mid]){
           return rec(array,target,start,mid - 1);
        }
        return rec(array,target,mid+1,end);

    }
}
