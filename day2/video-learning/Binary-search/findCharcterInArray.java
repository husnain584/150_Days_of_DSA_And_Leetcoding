public class findCharcterInArray {
    public static void main(String[] args) {

      char[] ans = {'c','f','j'};
      char target = 'a';

        System.out.println(smallestLetter(ans,target));

    }

    static char smallestLetter(char[] array , char target){
        int start = 0;
        int end = array.length-1;

        int mid = (start + end) / 2;

        if (target < array[mid]){
            end = mid - 1;
        } else if (target > array[mid]) {
            start = mid + 1;
        }

        return array[start % array.length];

    }
}

