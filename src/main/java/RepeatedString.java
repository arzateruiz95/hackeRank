public class RepeatedString {
    static long repeatedString(String s, long n) {
        long i = n%s.length();
        int countS = 0;
        long occurrences = 0;
        for (int j = 0; j < s.length(); j++) {
            countS = s.charAt(j) == 'a' ? countS + 1 : countS;
        }
        occurrences = countS*(n/s.length());
        int j=0;
        while (j < i) {
           occurrences = s.charAt(j) == 'a' ? occurrences + 1 : occurrences;
            j = j + 1 < s.length() ? j + 1 : 0;
        }
        return occurrences;
    }


    public static void main(String[] args)  {
        //aba 10 - 7  -- abaabaabaa 16481469408
        long veces = 549382313570l;//549382313570
        String word="epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
        System.err.println(repeatedString(word,veces));
    }
}
