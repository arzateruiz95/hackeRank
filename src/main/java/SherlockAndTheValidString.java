import java.util.*;
import java.util.stream.Collectors;

public class SherlockAndTheValidString {

    static String isValid(String s) {
        Object[] values =  mapOccurrences(s).values().toArray();
        int shortV = (Integer)values[0];
        int longV = (Integer)values[0];
        int minShort = 0;
        int minLong = 0;
        int i = 0;
        while (i < values.length) {
            if (shortV > (Integer) values[i]) {
                shortV = (Integer)values[i];
                minShort = 0;
                i = 0;

            } else {
                minShort = shortV < (Integer)values[i] ? ((Integer)values[i] - shortV) + minShort : minShort;
                i++;
            }
        }
        i=0;
        while (i < values.length) {
            if (longV < (Integer) values[i]) {
                longV = (Integer)values[i];
                minLong = 0;
                i = 0;
            } else {
                minLong = longV > (Integer)values[i] ?  (Integer)values[i] + minLong : minLong;
                i++;
            }
        }

        minShort = Math.min(minShort, minLong);
        return minShort < 2 ? "YES" : "NO";
    }


    static Map<String, Integer> mapOccurrences( String s) {
        return s.chars()
                .distinct()
                .boxed()
                .collect(Collectors.toMap(
                        String::valueOf,
                        c -> (int) s.chars().filter(ch -> ch == c).count()
                ));
    }


    public static void main(String[] args) {
        String s = "assdasdad";
        System.err.println(isValid(s));
    }
}
