public class searchInString {
    public static void main(String[] args) {

        String string = "Hello there";
        char str = 'e';
        System.out.println(search(string,str));


    }
    static boolean search(String str, char target){

        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
