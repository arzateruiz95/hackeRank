


import java.util.*;

public class PlusMinus {


    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        Map<Integer, Double> values = new HashMap<>();
        values.put(1,0.0);
        values.put(2,0.0);
        values.put(3,0.0);
        for (int a : arr) {
            if (a > 0) {
                values.put(1,  values.get(1)  + 1.0);
            } else if (a < 0) {
                values.put(2,  values.get(2)  + 1.0);
            } else {
                values.put(3,  values.get(3)  + 1.0);
            }
        }

        for (Double r : values.values()) {
            System.out.printf("%.6f %n", (r / (arr.length * 1.0)));
        }

    }
}