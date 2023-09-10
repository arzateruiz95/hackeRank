import java.util.Scanner;

public class Java1DArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            a[i] = val;
        }
        scan.close();

        for (int j : a) {
            System.out.println(j);
        }
    }
}
