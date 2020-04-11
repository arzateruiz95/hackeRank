import spock.lang.Specification
import spock.lang.Unroll

class EncryptionTest extends Specification {

    def setup() {}

    @Unroll
    def "Solution"() {
        when:
        String solve = Encryption.solution(text)
        then:
        solve == result

        where:
        text                                                     | result
        'haveaniceday'                                           | 'hae and via ecy'
        'feedthedog'                                             | 'fto ehg ee dd'
        'chillout'                                               | 'clu hlt io'
        'ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots' | 'imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau'
    }
}
