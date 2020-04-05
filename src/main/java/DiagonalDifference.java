import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        Integer l = 0;
        Integer r = 0;
        for (int j = 0; j < arr.size(); j++) {
            r += arr.get(j).get(j);
            l += arr.get(arr.size() - (j+1)).get(j);
        }

        return Math.abs(r - l);
    }

}
