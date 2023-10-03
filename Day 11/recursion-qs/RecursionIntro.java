import java.security.spec.RSAOtherPrimeInfo;

public class RecursionIntro {
    //   public static void main(String[] args) {
    // 1: first of all 1 want to print 1 to 5 numbers through functions so what's the method?
    // here's the simple method
//        print(1);
//    }
//    static void print(int n){
//        System.out.println(n);
//        print2(2);
//    }
//    static void print2(int n){
//        System.out.println(n);
//        print3(3);
//    }
//    static void print3(int n){
//        System.out.println(n);
//        print4(4);
//    }
//    static void print4(int n){
//        System.out.println(n);
//        print5(5);
//    }
//    static void print5(int n){
//        System.out.println(n);
//    };
//

    //  }
                              //          ***Recursion ***
    // function call itself is known as recursion;
    // in the previous code we repeat ourselves . let's suppose we print thousands of number so what we do?
    // here's recursion come in mind;

    //  1 : lets solve this using recursion
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n ){
        if (n == 5){
            System.out.println(5);
            return;
        }
        // this actually is base condition : this is the condition where our recursion will stop to make new calls;
        System.out.println(n);
        print(n + 1);
    }
}