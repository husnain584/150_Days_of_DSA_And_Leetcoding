public class Performance {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 26 ; i++) {
            char ch = (char) ('a' + i);
            str = str + ch;
        }
        System.out.println(str);

        // by doing this the time complexity is O(n square); because every time when str change new object is made and pre
        // previous one hac not then any use so this is not the optimized way to do this;
        // so that's why we use string builder

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        // string builder are like arrays means it is mutable
    }
}
