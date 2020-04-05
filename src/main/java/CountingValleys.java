import java.util.Scanner;

public class CountingValleys {


    private static final Integer SEA_LEVEL = 0;

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        Integer valley = 0;// Number of valleys
        Integer level = SEA_LEVEL; //0 sea level
        Integer lastStep = SEA_LEVEL;
        for (int i = 0; i < n; i++) {
            level = s.charAt(i) == 'D' ? level - 1 : level + 1;
            valley = level.equals(SEA_LEVEL) && lastStep < 0 ? valley + 1 : valley;
            lastStep=level;
        }
        return valley;
    }



    public static void main(String[] args) {
        //UDDDUDUU  - 8     - 1
        //DDUUDDUDUUUD - 12 - 2
        //UDUUUDUDDD - 10   - 0
        //DUDDDUUDUU - 10   - 2
        //DDUDDUUDUU - 10   - 1
        String steps = "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD";
        int result = countingValleys(100, steps);
        System.err.println(result);
    }
}
