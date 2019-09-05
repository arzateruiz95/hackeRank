import spock.lang.Specification
import spock.lang.Unroll

class SimpleArraySumTest extends Specification {

    void setup() {

    }


    @Unroll
    void 'validateArraySum'() {

        when:
        int ans = SimpleArraySum.simpleArraySum(s as int[])
        then:
        ans == res
        where:
        s                | res
        [11, 5, 5, 8, 2] | 31
        [11111111]       | 11111111

    }


}
