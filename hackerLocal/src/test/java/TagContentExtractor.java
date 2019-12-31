import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TagContentExtractor {

    private static final String NONE = "None";
    private static final String EMPTY = "";

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            List<String> openSplit = Arrays.asList(line.split("><"));
            System.err.println("------" + testCases + "------");

            for (String g : openSplit) {
                g = getTag(g);
                String[] openSplit1 = g.split("(<|/)");
                List<String> openSplit2 = new ArrayList<>();
                for (String v : openSplit1) {
                    if (!v.equals(EMPTY)) {
                        openSplit2.add(v);
                    }
                }
                for (String v : openSplit2) {
                    System.err.println("  " + v);
                }
            }
            testCases--;
        }
    }

    private static String getTag(String line) {
        String tag = line;
        if (tag.toCharArray()[0] != '<') {
            tag = "<".concat(tag);
        }
        if (tag.toCharArray()[tag.toCharArray().length - 1] != '>') {
            tag = tag.concat(">");
        }

        return tag;
    }
}
