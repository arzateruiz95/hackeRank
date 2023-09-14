import java.util.*;

public class MakingAnagrams {

    static int makeAnagram(String a, String b) {
        Map<String, Integer> aValues = mapOccurrences((a.concat(b)).toCharArray(), a);
        Map<String, Integer> bValues = mapOccurrences((a.concat(b)).toCharArray(), b);
        int count = 0;
        for (String key : aValues.keySet()) {
            int difference = aValues.get(key) <= bValues.get(key) ? bValues.get(key) - aValues.get(key) : aValues.get(key) - bValues.get(key);
            count= difference == 0 ? count : count+difference;
        }
        return count;
    }

    static Map<String, Integer> mapOccurrences(char[] valuesC, String anagram) {
        Map<String, Integer> values = new HashMap<String, Integer>();
        for (char c : valuesC) {
            String temp = String.valueOf(c);
            values.put(temp, repeatedString(anagram, c));
        }
        return values;
    }

    static int repeatedString(String s, char c) {
        int countS = 0;
        for (int j = 0; j < s.length(); j++) {
            countS = s.charAt(j) == c ? countS + 1 : countS;
        }
        return countS;
    }


    public static void main(String[] args) {

        String a = "bacd";
        String b = "dcbac";
        System.err.println(makeAnagram(a, b));
    }
}
