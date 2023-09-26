public class QuestionFive {
//             *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *
public static void main(String[] args) {
    int stars = 5;
    patternFive(stars);

}
public static void patternFive(int n){
    for (int i = 1; i < 2 * n ; i++) {
              int totalCol =  i > n ? 2 * n - i : i ;
        for (int j = 1; j <= totalCol ; j++) {
            System.out.print("* ");
        }
        System.out.println();

        }

    }

}
