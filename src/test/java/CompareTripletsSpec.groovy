import spock.lang.Specification

class CompareTripletsSpec extends Specification {

    void setup() {

    }

    void 'validateTripletas'() {
        when:
        List<Integer> result = CompareTriplets.compareTriplets(Arrays.asList(a as Integer[]), Arrays.asList(b as Integer[]))
        then:
        result == res
        where:
        a            | b           | res
        [17, 28, 30] | [99, 16, 8] | [2, 1]
    }
}
