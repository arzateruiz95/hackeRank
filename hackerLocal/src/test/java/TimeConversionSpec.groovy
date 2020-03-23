import spock.lang.Specification

class TimeConversionSpec extends Specification {




    void setup(){

    }

    def "validate Time Conversation" () {
        when:
        String result = TimeConversion.timeConversion(date)
        then:
        result ==  military
        where:
        date | military
        "07:05:45AM"   | "07:05:45"
        "07:05:45PM"   | "19:05:45"
        "12:45:54PM"   | "12:45:54"
    }
}
