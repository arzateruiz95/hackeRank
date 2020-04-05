import spock.lang.Specification

class MiniMaxSumSpec extends Specification {

    void setup() {}

    def "Solution of MinMaxSum"() {
        when:
        String solution = MiniMaxSum.solution(instance as int[])
        then:
        solution == result
        where:
        instance        | result
        [1, 2, 3, 4, 5] | '10 14'
        [140638725, 436257910, 953274816, 734065819, 362748590] | '1673711044 2486347135'
    }
}
