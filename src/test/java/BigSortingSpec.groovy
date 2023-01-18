import spock.lang.Specification
import util.ReadFileUtil

class BigSortingSpec extends Specification {
    private ReadFileUtil readFileUtil
    void setup() {
    }


    def "BigSorting"() {
        given:
        readFileUtil = new ReadFileUtil(fileName)
        when:
        List<String> result = BigSorting.bigSorting(readFileUtil.extractFile())
        then:
        result != null
        where:
        fileName = '/home/luisarzate/Documents/courses/HackerRank/hackeRank/src/test/resources/big-sorting-testcases/input/input00.txt'
    }
}
