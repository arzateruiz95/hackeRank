import java.util.Optional;

public class TimeConversion {


    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        if (s.contains("PM") && s.contains("12")) {
            s = s.substring(0, 8);
        } else  if (s.contains("PM") ) {
            int num = Integer.parseInt(s.substring(0, 2));
            s = String.valueOf(num + 12).concat(s.substring(2, 8));
        } else if (s.contains("12")) {
            s = "00".concat(s.substring(2, 8));

        } else {
            s = s.substring(0, 8);

        }
        return s;
    }

}
