import spock.lang.Specification
import util.ReadFileUtil

import java.util.stream.Collectors

class CakeCandlesSpec extends Specification {


    private ReadFileUtil readFileUtil

    void setup() {
    }

    def "BirthdayCakeCandles"() {
        given:
        readFileUtil = new ReadFileUtil(fileName)
        List<Integer> candles = readFileUtil.extractNumberArray(1, Integer.class).toList()
        when:
        int spec = CakeCandles.birthdayCakeCandles(candles)
        then:
        spec == 7174
        where:
        fileName = '../CakeCandle/birthday-cake-candles-testcases/input/input00.txt'

    }
}
