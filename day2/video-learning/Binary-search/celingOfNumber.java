public class celingOfNumber {
//    q;1 find celling of a number;
public static void main(String[] args) {

    int[] array = {1,3,5,6};
   int target = 2;
    System.out.println(celing(array, target));

}
static  int celing(int[] array ,int target){

    int start = 0;
    int end = array.length-1;

    while (start <= end){
        int mid = (start + end) / 2;

        if (target < array[mid]){
            end = mid - 1;
        } else if (target > array[mid]) {
            start = mid + 1;
        }
    else {
            return mid;
        }

    }
    return start;
}


}
