import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BigSorting {


    public static void main(String[] args) {
        List<String> r =  bigSorting( Arrays.asList(
                "6",
                "31415926535897932384626433832795",
                "1",
                "3",
                "10",
                "3",
                "5"
        ));
        System.out.println(Arrays.toString(r.toArray()));
    }

    /*
     * Complete the 'bigSorting' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY unsorted as parameter.
     */
    public static List<String> bigSorting(List<String> unsorted) {
        Stream<BigInteger> auxNum =  unsorted.stream().map(BigInteger::new);
        Stream<BigInteger> aux = auxNum.sorted();
        return aux.map(BigInteger::toString).collect(Collectors.toList());
    }


}
/**
 * import java.io.*;
 * import java.util.Arrays;
 * import java.util.Comparator;
 *
 * public class Solution {
 *
 * 	static class strcmp implements Comparator<String> {
 *
 *                @Override
 *        public int compare(String o1, String o2) {
 * 			int l1 = o1.length(), l2 = o2.length();
 * 			return l1 > l2 ? 1 : (l2 > l1 ? -1 : o1.compareTo(o2));
 *        }
 *    * 	}
 *
 * 	public static void main(String[] args) throws IOException {
 * 		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 * 		int n = Integer.parseInt(in.readLine());
 * 		String[] unsorted = new String[n];
 * 		for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
 * 			unsorted[unsorted_i] = in.readLine();
 *        }
 * 		Arrays.sort(unsorted, new strcmp());
 * 		for(String s : unsorted)
 * 			System.out.println(s);    * 	}
 * }
 */