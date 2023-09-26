public class QuestionSix {
//             *
//            **
//           ***
//          ****
//         *****
public static void main(String[] args) {

    int stars = 5;
    patternFive(stars);

}
    public static void patternFive(int n){
        for (int i = 1; i <= n ; i++) {
            // print spaces
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }

}
