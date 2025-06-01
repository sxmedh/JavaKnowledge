package questions.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetTwo {

    List<List<Integer>> subsetList = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        this.nums = nums;
        recursivePicking(0,new ArrayList<>());
        return subsetList;
    }

    void recursivePicking(int i,List<Integer> passedList) {
        if (i == nums.length) {
            if (subsetList.contains(passedList)) {
                return;
            }
            subsetList.add(passedList);
            return;
        }
        List<Integer> passedList1 = new ArrayList<>(passedList);
        passedList1.add(nums[i]);
        recursivePicking(i+1,passedList1);
        recursivePicking(i+1,passedList);
    }

}
