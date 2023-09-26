public class QuestionThree {
//           *****
//            ****
//            ***
//            **
//            *

    public static void main(String[] args) {
        int stars = 5;
        patternThree(stars);
    }
    static void patternThree(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
