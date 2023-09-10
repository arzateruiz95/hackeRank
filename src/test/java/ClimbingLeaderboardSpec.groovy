import spock.lang.Specification
import spock.lang.Unroll

class ClimbingLeaderboardSpec extends Specification {


    void setup() {
    }

    @Unroll
    void 'Valida ClimbingLeaderBoard'() {
        when:
        int[] result = ClimbingLeaderboard.climbingLeaderboard(scores, alice)
        then:
        result == value
        where:

        caso | scores                                                | alice                                             | value
        'p1' | [100, 70, 70, 50, 10, 10] as int[]                | [5, 50, 105] as int[]                         | [5, 3, 1] as int[]
        'p2' | [100, 100, 50, 40, 40, 20, 10] as int[]           | [5, 25, 50, 100] as int[]                     | [6, 4, 2, 1] as int[]
        'p3' | [100, 90, 90, 80, 75, 60] as int[]                | [50, 65, 77, 90, 102] as int[]                | [6, 5, 4, 2, 1] as int[]
        'p4' | [100, 90, 90, 80, 75, 60, 40, 30, 19, 8] as int[] | [5, 8, 41, 50, 60, 77, 90, 100, 102] as int[] | [10, 9, 6, 6, 5, 4, 2, 1, 1] as int[]
    }
}
