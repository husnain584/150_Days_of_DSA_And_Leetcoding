public class QuestionFout {
//             1
//            1 2
//            1 2 3
//            1 2 3 4
//            1 2 3 4 5

    public static void main(String[] args) {

        int stars = 5;
        patternthree(stars);
    }
    public static  void patternthree(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
