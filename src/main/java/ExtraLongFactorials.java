import java.math.BigInteger;

public class ExtraLongFactorials {

    static BigInteger solution(int n) {
        BigInteger factorials = BigInteger.valueOf(n);
        while (n != 1) {
            factorials = factorials.multiply(BigInteger.valueOf(n - 1));
            n--;
        }
        System.out.println(factorials);
return factorials;
    }
}
