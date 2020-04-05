import spock.lang.Specification

class MakingAnagramsSpec extends Specification {


    void setup(){
    }

    void "Validate anagrams"() {
        when:
        int answer = MakingAnagrams.makeAnagram(a, b)
        then:
        answer == value
        where:
        a       | b       | value
        'bacdc' | 'dcbac' | 0
        'cde'   | 'abc'   | 4
    }


}
