public class Questionten {
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
        public static void main(String[] args) {
            int star = 5;
            patternTen(star);
        }
        static void patternTen(int n){
            for (int i = 1; i <= n ; i++) {
                // to print spaces
                for (int j = 2; j <=i+1 ; j++) {
                    System.out.print(" ");
                }
                // to print starts
                for (int k = 1; k <= n - i +1 ; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


