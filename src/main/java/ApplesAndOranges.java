import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApplesAndOranges {

    public static void main(String[] args) {
    countApplesAndOranges(7,10,4,12, Arrays.asList(2, 3, -4),Arrays.asList(3, -2, -4));
    }

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s s: integer, starting point of Sam's house location.
     *  2. INTEGER t t: integer, ending location of Sam's house location.
     *  3. INTEGER a a: integer, location of the Apple tree.
     *  4. INTEGER b b: integer, location of the Orange tree.
     *  5. INTEGER_ARRAY apples apples: integer array, distances at which each apple falls from the tree.
     *  6. INTEGER_ARRAY oranges oranges: integer array, distances at which each orange falls from the tree.
     */
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        Long applesResult = apples.stream().map(it -> it + a).filter(it -> it >= s &&  it <= t).count();
        Long orangesResult= oranges.stream().map(it -> it + b).filter(it -> it >= s &&  it <= t).count();
        System.out.println(applesResult);
        System.out.println(orangesResult);
    }

}
