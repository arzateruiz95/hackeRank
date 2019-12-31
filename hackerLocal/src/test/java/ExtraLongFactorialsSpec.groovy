import spock.lang.Specification

class ExtraLongFactorialsSpec extends Specification {


    void setup() {

    }


    def "Check ExtraLongFactorials"() {
        when:
       BigInteger result =  ExtraLongFactorials.solution(n)
        then:
        result == r
        where:
        caso | n | r
        '1' | 25 | 15511210043330985984000000
        '2' | 30 | 265252859812191058636308480000000
    }
}
