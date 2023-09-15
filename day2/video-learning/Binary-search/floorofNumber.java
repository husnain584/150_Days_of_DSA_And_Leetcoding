public class floorofNumber {
    public static void main(String[] args) {

        int[] array = {1,2,4,5,6,9,12,34};
        int target = 7;
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
            return end;
        }


    }
