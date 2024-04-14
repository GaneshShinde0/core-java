import java.util.function.Function;

public class Capitalize {
    public static void main(String[] args) {
        String input = "hello world";
        System.out.println(capitalizeSubstring(input));
        System.out.println(capitalizeStringBuilder(input));
        System.out.println(capitalizeStringBuffer(input));
        System.out.println(capitalizeCharArray(input));
    }

    private static String capitalizeSubstring(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private static String capitalizeStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }

    private static String capitalizeStringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }

    private static String capitalizeCharArray(String str) {
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        return new String(charArray);
    }
}
