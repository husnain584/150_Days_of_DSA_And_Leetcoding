public class rotatedArray {
    public static void main(String[] args) {

        int[] array = {4,5,6,7,0,1,2};
       int target =  5;
        System.out.println(search(array, target));

    }

    static int search(int[] array , int target){
        int pivot = pivot(array);

      if (pivot == -1){
       return  celing(array , target , 0 , array.length-1);
      }
       else if (pivot != -1){
             int first = celing(array , target , 0 ,pivot);
             int second = celing(array, target , pivot +1 , array.length -1);
             if (first != -1){
                 return  first;
             } return second;

      }
return -1;
    }

    static  int celing(int[] array ,int target, int start , int end){



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
        return -1;
    }


    // first of all we should find the pivot element in the array;
    static  int pivot(int[] array){

        int start = 0;
        int end = array.length-1;

        while(start<=end){
            int mid = start+ (end - start)/2;

           if ( mid < end &&  array[mid] > array[mid +1]){
               return mid;
           }else if (  mid > start &&     array[mid] < array[mid-1]){
               return mid-1;
           } else if (array[mid] < array[start]) {
               end = mid - 1;
           }else {
               start = mid + 1;
           }
        }
return  -1;
    }
}
