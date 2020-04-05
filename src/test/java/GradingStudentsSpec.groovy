import spock.lang.Specification
import util.ReadFileUtil

class GradingStudentsSpec extends Specification {

    private ReadFileUtil readFileUtil


    def "GradingStudents rounding" (){
        given:
        readFileUtil = new ReadFileUtil(fileName)
        when:
        List grades = GradingStudents.gradingStudents( Arrays.asList(readFileUtil.extractNumberArray(0,Integer.class)))
        then:
        grades == [75,67,40,33]
        where:
        fileName = 'C:\\Users\\luis.arzate\\Documents\\courses\\hackeRank\\grading-testcases\\input\\input00.txt'

    }
}
