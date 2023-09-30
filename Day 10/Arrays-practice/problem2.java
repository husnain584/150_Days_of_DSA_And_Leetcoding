public class problem2 {

    // linear search problem;

    //Find Numbers with Even Number of digits

    public static void main(String[] args) {
        int[] array = {1,23,233,56,5,23456};

        System.out.println(numbercontain(array));

    }

    static  int numbercontain(int[] array ){
        int count = 0;

        for (int i = 0; i <array.length; i++) {
            if (even(array[i])){
                count = count+1;
            }
        }

        return count;
    }

    private static boolean even(int number) {
        int numberofdigit = digit(number);

        if (numberofdigit % 2 == 0){
            return true;
        }
return false;
    }

    static int digit(int number) {

        if (number < 0 ){
            number = number* -1;
        }
        if (number == 0){
            return 1;
        }

        int count = 0;
        while (number>0){
            count++;
            number = number / 10;
        }
        return  count;
    }


}
