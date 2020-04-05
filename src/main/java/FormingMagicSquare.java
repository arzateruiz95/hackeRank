import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormingMagicSquare {

    static int formingMagicSquare(int[][] s) {
        int[][] magic;
        int w;
        int z = 0;
        Map<Integer, List<Integer>> sumas = new HashMap<>();
        for (int x = 0; x < 5; x++) {
            w = sumRows(x, s);
            if (sumas.containsKey(w)){

            }else{
               // sumas.put(w, List.);
            }
            //sumas.put(w, sumas.containsKey(w) ? sumas.get(w) + 1 : 1);
        }

        return 1;
    }

    public static boolean validate(int aux, int[][] s) {
        int z = 0;
        int w;
        for (int x = 0; x < 5; x++) {
            w = sumRows(x, s) - aux;
            if (w < 0) {
                z = 0;
            } else if (w > 0) {
                z = 0;
            } else {
                z++;
            }
        }
        return z == 5;
    }

    public static int sumRows(Integer row, int[][] s) {
        if (row < 3) {
            return s[row][0] + s[row][1] + s[row][2];
        } else if (row == 3) {
            return s[0][0] + s[1][1] + s[2][2];
        }
        return s[0][2] + s[1][1] + s[2][0];
    }

}
