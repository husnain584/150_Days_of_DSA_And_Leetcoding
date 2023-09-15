import java.util.Arrays;

public class sorted2darray {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        int target = 2;

        System.out.println(Arrays.toString(darray(array,target)));

    }

    static  int[] binarySearch(int[][] array ,int row,int cStart,int cEnd,int target){


        while (cStart<= cEnd){
            int mid = cStart + (cEnd - cStart )/ 2;
            if (target == array[row][mid]){
                return  new int[]{row , mid};
            }else if (target < array[row][mid]){
                cEnd = mid - 1;
            }else {
                cStart = mid + 1;
            }
        }
        return  new int[]{-1,-1};
    }
    static int[] darray(int[][] array, int target){

        int row = array.length;
        int col = array[0].length;

        if (row == 1){
            return  binarySearch(array,0,0, col-1,target);
        }

        int rStart = 0;
        int rEnd = row -1;
        int cMid = col / 2;

        while ( rStart < rEnd - 1){
            // if this is true it means it have more then two rows
            int mid = rStart + ( rEnd - rStart)/2;
            if (array[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if (array[mid][cMid] < target){
                rStart = mid;
            }else {
                rEnd = mid;
            }
        }
         // now we have only 2 rows;
        // check wheather the elemnt is in col2 or not
        if (array[rStart][cMid] == target){
            return  new int[]{rStart , cMid};
        }
        if (array[rStart + 1][cMid] == target){
            return  new int[]{rStart + 1 , cMid};
        }

        // check in other four half;

        // First Half ;
        if (target <=array[rStart][cMid - 1] ){
              return binarySearch(array,rStart,0,cMid-1,target);
        }

        // second half
        if (target >=array[rStart][cMid + 1] && target <= array[rStart][col - 1] ){
            return binarySearch(array,rStart,cMid+1,col-1,target);
        }
        // third half;
        if (target < array[rStart + 1][cMid - 1]){
            return binarySearch(array,rStart+1,0,cMid - 1,target);
        }
        // fourth half
        else {
            return binarySearch(array,rStart+1,cMid+1,col-1,target);
        }





    }
}
