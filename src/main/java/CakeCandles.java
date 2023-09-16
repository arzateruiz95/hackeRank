import java.util.List;
import java.util.NoSuchElementException;

public class CakeCandles {

    public static void main(String[] args) {

    }

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        Integer tallest = candles.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
        long l =candles.stream().filter(v -> v.equals(tallest)).count();
       return 0;
    }

}
