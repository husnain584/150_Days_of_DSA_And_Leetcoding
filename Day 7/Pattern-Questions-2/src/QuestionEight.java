public class QuestionEight {
//             *
//            ***
//            *****
//            *******
//            *********
    public static void main(String[] args) {
        int star = 5;
        patterneight(star);
    }
    static void patterneight(int n){
        for (int i = 1; i <= n ; i++) {

            // to print spaces
            for (int k = 1; k <= n - i ; k++) {
                System.out.print(" ");
            }
            // to print starts
            for (int j = 1; j <=  2*i - 1  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
