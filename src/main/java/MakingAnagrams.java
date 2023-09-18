import java.util.*;

public class MakingAnagrams {

    static int makeAnagram(String a, String b) {
        Map<String, Integer> aValues = mapOccurrences((a.concat(b)).toCharArray(), a);
        Map<String, Integer> bValues = mapOccurrences((a.concat(b)).toCharArray(), b);
        int count = 0;
        for (String key : aValues.keySet()) {
            int difference = aValues.get(key) <= bValues.get(key) ? bValues.get(key) - aValues.get(key) : aValues.get(key) - bValues.get(key);
            count = difference == 0 ? count : count + difference;
        }
        return count;
    }

    static Map<String, Integer> mapOccurrences(char[] valuesC, String anagram) {
        Map<String, Integer> values = new HashMap<>();

        for (char c : valuesC) {
            int count = (int) anagram.chars().filter(ch -> ch == c).count();
            values.put(String.valueOf(c), count);
        }
        return values;
    }

    public static void main(String[] args) {

        String a = "bacd";
        String b = "dcbac";
        System.err.println(makeAnagram(a, b));
    }
}
