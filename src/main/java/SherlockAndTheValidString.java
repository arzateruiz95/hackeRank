import java.util.*;

public class SherlockAndTheValidString {

    public static final String YES = "YES";
    public static final String NO = "NO";

    static String isValid(String s) {
        int count1 = 0;
        int count2 = 0;
        Object[]valores =  mapOccurrences(s.toCharArray(), s).values().toArray();
        int shortV = (Integer)valores[0];
        int longV = (Integer)valores[0];
        int i = 0;
        while (i < valores.length) {
            if (shortV > (Integer) valores[i]) {
                shortV = (Integer)valores[i];
                count1 = 0;
                i = 0;
            } else {
                count1 = shortV < (Integer)valores[i] ? ((Integer)valores[i] - shortV) +count1 : count1;
                i++;
            }
        }
        i=0;
        while (i < valores.length) {
            if (longV < (Integer) valores[i]) {
                longV = (Integer)valores[i];
                count2 = 0;
                i = 0;
            } else {
                count2 = longV > (Integer)valores[i] ?  (((Integer)valores[i]+longV)-longV ) + count2 : count2;
                i++;
            }
        }

        count1 = count1<count2?count1:count2;
        return count1 < 2 ? YES : NO;
    }

    static Map<String, Integer> mapOccurrences(char[] valuesC, String s) {
        Map<String, Integer> values = new HashMap<String, Integer>();
        List<String> q = new ArrayList<String>();
        for (char c : valuesC) {
            String temp = String.valueOf(c);
            if (!q.contains(temp)) {
                values.put(temp, repeatedString(s, c));
            }
            q.add(String.valueOf(c));
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
        String s = "assdasdad";
        System.err.println(isValid(s));
    }
}
