import java.io.IOException;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
        int step = 0;
        int i = 0;
        while (i + 1 < c.length) {
            if ((i + 2) < c.length) {
                i = c[i + 2] == 0 ? i + 2 : i + 1;
            } else {
                i++;
            }
            step++;
        }
        return step;
    }

    public static void main(String[] args) throws IOException {

        //0,1,0,0,1,0 3
        //0, 0, 1, 0, 0, 1, 0 4
        //6
        //0, 0, 0, 1, 0, 0 3
        int[] c ={0,1,0,0,1,0};
        System.err.println(jumpingOnClouds(c));
    }

}
