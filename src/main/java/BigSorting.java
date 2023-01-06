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
