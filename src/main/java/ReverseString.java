import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(revertStringS("Lorem Ipsum is simply dummy text of the printing and typesetting"));
        System.out.println(revertString("Lorem Ipsum is simply dummy text of the printing and typesetting"));
    }

    public static String revertString(String value) {
        char[] chars = value.toCharArray();
        char temp;
        for (int i = 0, j = value.length() - 1; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

    public static String revertStringS(String value) {
        return value.chars().mapToObj(c -> (char)c )
                .reduce("", (s,c) -> c+s, (s1, s2) -> s1 + s2);
    }

}
