import spock.lang.Specification

class StaircaseSpec extends Specification {


    void setup(){

    }

    def "Validate Staircase solution" () {
        given:
        int valor =  4
        when:
        Staircase.staircase(valor)
        then:
        true
    }
}
