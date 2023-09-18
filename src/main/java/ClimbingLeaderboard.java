import java.util.*;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];
        Map<Integer, Integer>  climbing = new HashMap<Integer, Integer> ();
        int scoresLength = scores.length;
        int count = 1;

        for (int score : scores) {
            if (!climbing.containsKey(score)) {
                climbing.put(score, count);
                count++;
            }
        }
        count = 0;
        for (Integer scoreA : alice) {
            if (climbing.containsKey(scoreA)) {
                int d = 0;
                int dAux = (scoresLength - 1) / 2;
                int aux;
                while (scores[dAux] > scoreA) {
                    d = dAux;
                    aux = dAux + (dAux / 2);
                    dAux = aux < scoresLength ? aux : dAux + 1;
                }
                for (int i = d; i <= dAux; i++) {
                    if (scores[i] == scoreA) {
                        result[count] = climbing.get(scores[i]);
                        break;
                    }
                }
            } else {
                result[count] = scores[0] < scoreA ? 1 : newPosition(climbing, scoreA, scores, scoresLength);
            }
            count++;
        }
        return result;
    }

    private static int newPosition(Map<Integer, Integer>  climbing, int score, int[] scores, int scoresLength) {
        if (score > scores[scores.length - 1]) {
            int d = 1;
            int dAux = (scoresLength - 1) / 2;
            int aux;
            while (scores[dAux] > score) {
                d = dAux;
                aux = dAux + (dAux / 2);
                dAux = aux < scoresLength ? aux : dAux + 1;
            }
            int r = climbing.get(scores[d]);
            for (int i = d; i < scoresLength - 1; i++) {
                if (scores[i] > score && scores[i + 1] < score) {
                    r = climbing.get(scores[i + 1]);
                    break;
                }
            }
            return r;
        }
        return climbing.get(scores[scores.length - 1]) + 1;
    }


}
