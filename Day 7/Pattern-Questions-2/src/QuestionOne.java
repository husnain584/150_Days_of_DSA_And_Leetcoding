public class QuestionOne {
    //    *
    //    **
    //    ***
    //    ****
    //    *****
    public static void main(String[] args) {
        int stars = 4;
        patternOne(stars);

    }
    public  static void patternOne(int n){
        // first of all identify the no of rows and run outer loop for rows
        for (int i = 1; i <= n ; i++) {
            // run loop for columns how many columns you want to print in this case you want the no of columns
            // equals to no of rows
            for (int j = 1; j <=i ; j++) {
            //here tou tell what elements you want to print
                System.out.print("*");
            }
            // after every iteration of printing column add new line also;
            System.out.println();

        }
    }
}
