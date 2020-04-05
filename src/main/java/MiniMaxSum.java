import java.util.Arrays;

public class MiniMaxSum {

    static String solution(int[] arr) {
        int length = arr.length;

        long[] copy;
        long[] result = new long[length];

        for (int w = 0; w < length; w++) {
            copy = Arrays.stream(arr).asLongStream().toArray();
            copy[w] = 0;
            result[w] = Arrays.stream(copy).sum();
        }

        String solution = Arrays.stream(result).min().getAsLong() + " " + Arrays.stream(result).max().getAsLong();
        System.out.print(solution);
        return solution;
    }

}
