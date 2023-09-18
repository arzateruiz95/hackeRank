import java.io.*;
import java.util.*;

public class TheTimeInWords {

    private static final int HALF = 30;

    private static final String SPACE = " ";
    private static final Map<Integer, String> NUMBERS;
    private static final List<String> EXACT_TIME = Arrays.asList("quarter", "half");

    static {
        NUMBERS = new HashMap<Integer, String>();
        NUMBERS.put(0, "o' clock");
        NUMBERS.put(1, "one");
        NUMBERS.put(2, "two");
        NUMBERS.put(3, "three");
        NUMBERS.put(4, "four");
        NUMBERS.put(5, "five");
        NUMBERS.put(6, "six");
        NUMBERS.put(7, "seven");
        NUMBERS.put(8, "eight");
        NUMBERS.put(9, "nine");
        NUMBERS.put(10, "ten");
        NUMBERS.put(11, "eleven");
        NUMBERS.put(12, "twelve");
        NUMBERS.put(13, "thirteen");
        NUMBERS.put(14, "fourteen");
        NUMBERS.put(15, "quarter");
        NUMBERS.put(16, "sixteen");
        NUMBERS.put(17, "seventeen");
        NUMBERS.put(18, "eighteen");
        NUMBERS.put(19, "nineteen");
        NUMBERS.put(20, "twenty");
        NUMBERS.put(30, "half");
        NUMBERS.put(45, "quarter");
    }




    static String timeInWords(int h, int m) {
        StringBuilder builder = new StringBuilder();
        if (m != 0) {
             timeFormat(h, m, builder);
        }else {
            builder.append(NUMBERS.get(h));
            builder.append(SPACE).append(NUMBERS.get(m));
        }
        return builder.toString();
    }

    static void timeFormat(int h, int m, StringBuilder builder) {
        h = m > HALF ? h != 12 ? h + 1 : 1 : h;
        getMinutes(m, builder);
        builder.append(SPACE)
                .append(m > HALF ? "to" : "past")
                .append(SPACE)
                .append(NUMBERS.get(h));
    }

    static void getMinutes(int m,  StringBuilder builder) {
        m = m <= HALF ? m : 60 - m;
        int minuteMinusTwenty = m - 20;
        String number = NUMBERS.get(m);
        if (0 < minuteMinusTwenty && minuteMinusTwenty < 10) {
            builder.append(NUMBERS.get(20)).append(SPACE).append(NUMBERS.get(minuteMinusTwenty));
        } else {
            builder.append(number);
        }
        String minutes = EXACT_TIME.contains(number) ? "" : m == 1 ? " minute": " minutes";
        builder.append(minutes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}