public class QuestionSeven {
//            *****
//            ****
//            ***
//            **
//            *
public static void main(String[] args) {
    int star = 5;
    patternseven(star);
}
static void patternseven(int n){
    for (int i = 1; i <= n ; i++) {
        for (int j = 1; j <= n - i + 1 ; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
