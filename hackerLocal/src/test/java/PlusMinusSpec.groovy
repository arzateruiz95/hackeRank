import spock.lang.Specification

class PlusMinusSpec extends Specification {


    void setup() {

    }

    void 'PlusMinus'() {
        given:
        int[] v = [0, -67, -74, -38, -72, -53, 0, -13, -95, -91, -100, -59, 0, -10, -68, -71, -62, -21, 0, -42, -57, -16, -66, -23, 0, -80, -63, -68, -65, -71, 0, -71, -15, -32, -26, -8, 0, -6, -51, -87, -19, -71, 0, -93, -26, -35, -56, -89, 0, -21, -74, -39, -57, -8, 0, -69, -29, -24, -99,-53,0,-65,-42,-72,-18,-4,0,-73,-46,-63,-78,-87]
        when:
        PlusMinus.plusMinus(v)
        then:
        true
    }

}
