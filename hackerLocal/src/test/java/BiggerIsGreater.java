import java.util.Arrays;

public class BiggerIsGreater {

    private static final String NO_ANSWER = "no answer";

    static String solution(String w) {
        char[] word = w.toCharArray();
        int[] valueWord = new int[word.length];
        for (int i = 0; i < word.length; i++) {
            valueWord[i] = (int) word[i];
        }
        w = Arrays.toString(word).equals(w) ? NO_ANSWER : Arrays.toString(word);

        System.out.println(Arrays.toString(word));
        System.out.println(Arrays.toString(valueWord));
        return w;
    }

}
