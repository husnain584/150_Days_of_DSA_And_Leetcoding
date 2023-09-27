public class QuestionNine {
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *
//                *
//               * *
//              * * *
//             * * * *
//            * * * * *

    public static void main(String[] args) {
        int stars = 5;
        patternnine(stars);
    }
    static void patternnine(int n){
        for (int i = 1; i <= 2 * n ; i++) {
          // first of all I just print number of spaces
               int totalcol = i > n?  2* n - i      :  i -1;
            for (int j =0; j <= totalcol ; j++) {
                System.out.print(" ");
            }
            // I want to print stars;
            int totalcol2 = n - totalcol;
            for (int k = 1; k <= totalcol2  ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
