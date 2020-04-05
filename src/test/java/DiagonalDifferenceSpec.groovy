import spock.lang.Specification

class DiagonalDifferenceSpec extends Specification {

    void setup(){

    }

    void 'Difference '(){
        given:
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        list1.add(11)
        list1.add(2)
        list1.add(4)

        list2.add(4)
        list2.add(5)
        list2.add(6)

        list3.add(10)
        list3.add(8)
        list3.add(-12)
        List<List> param = new ArrayList<>()
        param.add(list1)
        param.add(list2)
        param.add(list3)

        when:
        Integer result = DiagonalDifference.diagonalDifference(param);
        then :
        result == 15

    }
}
