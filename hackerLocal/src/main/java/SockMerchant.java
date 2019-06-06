import java.io.*;
import java.util.*;

public class SockMerchant {



        // Complete the sockMerchant function below.
        static int sockMerchant(int n, int[] ar) {
            Arrays.sort(ar);
            int j = ar[0];
            int pairs = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                count = j == ar[i] ? count + 1 : count;
                if (j != ar[i] || i == n - 1) {
                    pairs += (count / 2);
                    count = 0;
                    j = ar[i];
                    i= i == n - 1 ? n : i-1;
                }
            }
            return pairs;
        }

        static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            //6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5
            //10, 20, 20, 10, 10, 30, 50, 10, 20
            int[] valor = {10, 20, 20, 10, 10, 30, 50, 10, 20};
            int result = sockMerchant(9, valor );
            System.err.println(result);

        }
    }