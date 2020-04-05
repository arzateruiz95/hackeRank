import spock.lang.Specification
import spock.lang.Unroll

class AlternatingCharactersSpec extends Specification {

    void setup() {}

    @Unroll
    void 'Validate number od deletion'() {
        when:
        int deletion = AlternatingCharacters.solution(s)
        then:
        deletion == answer
        where:
        s          | answer
        'ABABABAB' | 0
        'AABAAB'   | 2
        'AAAA'     | 3
        'BBBBB'    | 4
        'BABABA'   | 0
        'AAABBB'   | 4
    }
}
