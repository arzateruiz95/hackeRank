public class Staircase {

    private static final char HASH = '#';
    private static final char SPACE = ' ';

    // Complete the staircase function below.
    static void staircase(int n) {

        for (int i = 0; i < n; i++) {
            char[] word = new char[n];
            for (int j = 0; j < n; j++) {
                int delta = (n - 1) - i;
                word[j] = j >= delta ? HASH : SPACE;
            }
            System.out.println(word);
        }

    }

}
