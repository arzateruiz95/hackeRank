import java.util.List;

public class GradingStudents {

    private static final Integer ROUNDING = 38;

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int round;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38) {
                round = (grades.get(i) % 5);
                grades.set(i, round > 2 ? grades.get(i) + (5 - round) : grades.get(i));
            }
        }
        return grades;
    }

}
