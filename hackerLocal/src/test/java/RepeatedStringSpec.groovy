import spock.lang.Specification
import spock.lang.Unroll

class RepeatedStringSpec extends Specification {

    void setup(){
    }

    @Unroll
    void "Validacion de aaa en 10^6" () {

        when : ' validacion solucion '
        long answare  = RepeatedString.repeatedString(stringRepeat, repeat)
        then:
        answare  == valor
        where:
        stringRepeat | repeat | valor
        'aba'        | 10     | 7
        'abcac'      | 10     | 4
        'a'          |100000000000000l | 100000000000000l
    }

}
