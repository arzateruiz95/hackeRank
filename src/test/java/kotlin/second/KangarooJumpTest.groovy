package kotlin.second

import KangarooJump
import spock.lang.Specification

class KangarooJumpTest extends Specification {

    private KangarooJump kangarooJump

    void setup() {
        kangarooJump = new KangarooJump()
    }

    def "Should kangaroo return YES when kagaroo 1 is equals to kagaroo 2 jumps"() {

        when:
        def result = kangarooJump.kangaroo(k1Start, k2Start, k1Jumps, k2Jumps)

        then:
        "YES" == result
        where:
        k1Start | k2Start | k1Jumps | k2Jumps
        0       | 3       | 4       | 2
        2564    | 5393    | 5121    | 2836
    }
}
