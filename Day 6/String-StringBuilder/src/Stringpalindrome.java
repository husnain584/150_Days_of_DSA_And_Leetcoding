import javax.print.DocFlavor;

public class Stringpalindrome {
    // Question check whether a string is palindrome or not?
    public static void main(String[] args) {

        String str = "abccba";
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
       str =  str.toLowerCase();
       if (str == null|| str.length() == 0){
           return true;
       }
        int i = 0;
        int j = str.length()-1;
        while (i < j){
            if (str.charAt(i) == str.charAt(j) ){
                i++;
                j--;
            }else if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}