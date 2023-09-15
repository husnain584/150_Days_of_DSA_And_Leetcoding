public class orderIgnosticBS {
    public static void main(String[] args) {
        int[] array = {67,62,354,43,43,32,21,2};
       int target = 43;
        System.out.println(orderIgnostic(array , target));
    }

    static  int orderIgnostic(int[] array , int target){
        int start = 0;
        int end = array.length-1;

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

}
