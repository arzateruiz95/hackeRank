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

    private static boolean canWin(int[] a, boolean[] canJumps, int leap, int pos) {

        if (pos < 0)
            return false;
        if (pos >= a.length)
            return true;
        if (a[pos] == 1)
            return false;

        if (canJumps[pos])
            return false;
        canJumps[pos] = true;

        if (canWin(a, canJumps, leap, pos + leap))
            return true;

        if (canWin(a, canJumps, leap, pos + 1))
            return true;

        return canWin(a, canJumps, leap, pos - 1);
    }

}
