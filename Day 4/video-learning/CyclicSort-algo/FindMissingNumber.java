

public class FindMissingNumber {
    public static void main(String[] args) {

        int [] array = {4,0,1,3};
        int missingNumber = Cyclicsort(array);
        System.out.println("Missing number: " + missingNumber);

    }

    public static int Cyclicsort(int[] array){
        int i = 0 ;
        while (i < array.length){
            if (array[i] < array.length && array[i] != i){
                swap(array , i , array[i]);
            }
            else i++;
        }
        // now array is sorted, find the missing element
        for (int index = 0; index < array.length ; index++) {
            if (array[index] != index){
                return index;
            }
        }
        return array.length;
    }

    //swap function
    static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
