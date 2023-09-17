import java.util.Arrays;

public class CyclicSortAlgo {
    public static void main(String[] args) {

        int[] array = {3,5,2,1,4};
        CyclicSort(array);
        System.out.println(Arrays.toString(array));

    }
    static void CyclicSort(int[] array){
        for (int i = 0; i < array.length ; ) {
            int correct = array[i] - 1;
            if (array[i] != array[correct]){
                //swap
                swap(array,i,correct);
            }else i++;
        }
    }
    static void swap(int[] array , int first , int second){
        int tem = array[first];
       array[first]  =array[second];
        array[second] = tem;
    }


                     // we also perform this algo using other approaches like using while loop or etc
                    // here the code using while loop
//    static void CyclicSort(int [ ] array){
//        int i = 0;
//        while (i<array.length){
//            int correct = array[i] - 1;
//            if (array[i] != array[correct]){
//                // swap
//                swap(array , i , correct);
//            }else i++;
//        }
//    }
}
