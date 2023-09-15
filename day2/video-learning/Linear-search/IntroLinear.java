public class IntroLinear {
    public static void main(String[] args) {
//        Linear search is a simple searching algorithm that checks each element in a list or array sequentially until it finds the target element or exhausts the entire list. It's straightforward but not very efficient, especially for large datasets, as it has a time complexity of O(n), where n is the number of elements in the list.
//
//        Here's how the linear search algorithm works:
//
//        Input: Linear search takes a list or array and a target element to be searched for.
//
//        Search Loop: Starting from the first element (index 0), iterate through each element of the list.
//
//        Comparison: Compare the current element with the target element.
//
//        If the current element is equal to the target, the search is successful, and you return the index of the current element.
//                If the current element is not equal to the target, move to the next element and repeat the comparison.
//        Termination: Continue the loop until you find the target element or reach the end of the list. If the loop terminates without finding the target element, the element is not present in the list.
//
//
       int nums[] = {1,34,56,3,45,6};
       int integer = 344;


        System.out.println(linearsearch(nums,integer));

    }
    static  int linearsearch(int[] array , int target){

        if ( array.length == 0){
          return -1;
        }
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == target){
                return i;
            }
        }
       return -1;
    }
}
