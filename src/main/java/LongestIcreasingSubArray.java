import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIcreasingSubArray {

    public static void main(String[] args) {
        // two possible solution 2,4,7 or 6,8,9
        int[] test = {1, 3, 2, 4, 7, 6, 8, 9};
        int[] test2 = {1, 2, 3, 4, 5, 6, 8, 9};
        int[] test3 = {5,4,3,2,1};
        System.out.println(Arrays.toString(findLongestIncreasingSubArray(test3)));
        /*
         Scanner scan = new Scanner(System.in);
        Integer input = 0;
        List<Integer> inputList = new ArrayList<>();
        while(scan.hasNext()){
            inputList.add(scan.nextInt());
        }
         int[] test = inputList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(findLongestIncreasingSubArray(test)));
         */
    }


    public static int[] findLongestIncreasingSubArray(int[] nums) {
        int temp = nums[0];
        List<List<Integer>> listArray = new ArrayList<>();
        listArray.add(new ArrayList<>());
        for (int i = 1, y = 0; i <= nums.length; i++) {
            if (i < nums.length && temp < nums[i]) {
                listArray.get(y).add(temp);
            } else if (i != 1 && !listArray.get(y).isEmpty() && temp > listArray.get(y).get(listArray.get(y).size()-1) ) {
                listArray.get(y).add(temp);
                listArray.add(new ArrayList<>());
                y++;
            }
            temp = (i < nums.length) ? nums[i] : temp;
        }
        return listArray.stream().max((a, b) -> a.size() - b.size()).orElseGet(null).stream().mapToInt(Integer::intValue).toArray();
    }


}
