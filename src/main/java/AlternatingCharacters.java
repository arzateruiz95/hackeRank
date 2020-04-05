public class AlternatingCharacters {

    static int solution(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            count = s.charAt(i-1) == s.charAt(i) ? count + 1 : count;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "ABABABAB";
        System.err.println(solution(s));
    }
}
