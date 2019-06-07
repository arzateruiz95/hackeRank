import java.util.*;

public class ClimbingLeaderboard {

    private static int scoresLength;
    private static Map<Integer, Integer> climbing;


    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];
        climbing = new HashMap<Integer, Integer>();

        int count = 1;
        scoresLength = scores.length;
        for (int score : scores) {
            if (!climbing.containsKey(score)) {
                climbing.put(score, count);
                count++;
            }
        }
        count = 0;
        for (Integer scoreA : alice) {
            if (climbing.keySet().contains(scoreA)) {
                int d = 0;
                int dAux = (scoresLength - 1) / 2;
                int aux;
                while (scores[dAux] > scoreA) {
                    d = dAux;
                    aux = dAux + (dAux / 2);
                    dAux = aux < scoresLength ? aux : dAux + 1;
                }
                score:
                for (int i = d; i <= dAux; i++) {
                    if (scores[i] == scoreA) {
                        result[count] = climbing.get(scores[i]);
                        break score;
                    }
                }
            } else {
                result[count] = scores[0] < scoreA ? 1 : newPosition(scoreA, scores);
            }
            count++;
        }
        return result;
    }

    private static int newPosition(int score, int[] scores) {
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
