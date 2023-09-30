import com.sun.security.jgss.GSSUtil;

public class prob3 {
//    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//
//    A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {3, 4, 5}
        };

        System.out.println(answer(array));



    }

    static int answer(int[][] array){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = 0;
            for (int j = 0; j < array[i].length; j++) {
                value += array[i][j];
            }

            if (value > ans){
                ans = value;
            }
        }

        return ans;
    }
}
