import java.util.Scanner;

public class Java1DArrayPart2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[] a = new int[n];
            boolean[] v = new boolean[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
                v[j] = false;
            }
            System.out.println(canWin(a, v, m, 0) ? "YES" : "NO");
        }
    }

    private static boolean canWin(int[] game, boolean[] canJumps, int leap, int index) {

        if (index < 0)
            return false;
        if (index >= game.length)
            return true;
        if (game[index] == 1)
            return false;

        if (canJumps[index])
            return false;

        canJumps[index] = true;

        if (canWin(game, canJumps, leap, index + leap))
            return true;

        if (canWin(game, canJumps, leap, index + 1))
            return true;

        return canWin(game, canJumps, leap, index - 1);
    }

}
