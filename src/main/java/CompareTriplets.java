import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer[] result = new Integer[2];
        result[0] = 0;
        result[1] = 0;
        for (int i = 0; i < a.size(); i++) {

            if (a.get(i) > b.get(i)) {
                result[0] += 1;
            } else if (a.get(i) < b.get(i)) {
                result[1] += 1;
            }
        }
        return Arrays.asList(result);
    }

}
