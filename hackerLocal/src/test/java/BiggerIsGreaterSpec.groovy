import spock.lang.Specification

class BiggerIsGreaterSpec extends Specification {

    void setup(){

    }

    def "check BiggerlsGreater"(){
        when:
        String  word = BiggerIsGreater.solution(w)
        then:
        word == w
        where:
       caso | w
        1   |'dkhc'
        2   |'hcdk'
    }
}
