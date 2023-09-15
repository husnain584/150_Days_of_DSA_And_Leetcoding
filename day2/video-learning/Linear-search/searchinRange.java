public class searchinRange {
    public static void main(String[] args) {
        int[] array = {1,3,4,7,45,23,4,5};
        int target = 45;
        System.out.println(searchinrange(array , target , 2,3));

    }
    static int searchinrange(int[] array ,int target , int start , int end ){
        if (array.length == 0){
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    } ;

}
