import spock.lang.Specification
import util.ReadFileUtil

class FormingMagicSquareSpec extends Specification {
    private ReadFileUtil readFileUtil

    void setup() {
    }


    void "Validate Formin a magic Square"() {
        given:
        readFileUtil = new ReadFileUtil(fileName)
        when:
        int x = FormingMagicSquare.formingMagicSquare(readFileUtil.extractNumberSquare(Integer.class) as int[][])
        then:
        x == 1
        where:
        fileName = 'C:\\Users\\luis.arzate\\Documents\\courses\\hackeRank\\magic-square-forming-testcases\\input\\input00.txt'
    }
}
