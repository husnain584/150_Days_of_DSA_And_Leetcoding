public class QuestionTwo {
//            *****
//            *****
//            *****
//            *****
//            *****
public static void main(String[] args) {
    int stars = 5;
    patternTwo(stars);
    }
    static void patternTwo(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
