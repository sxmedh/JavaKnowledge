package questions.dp;

import java.util.Arrays;

public class HouseRobber {

    int[] nums;

    public int rob(int[] nums) {
        this.nums = nums;
        int[] array = new int[nums.length];
        Arrays.fill(array, -1);
        return findMax(nums.length - 1, array);
    }

    int findMax(int idx, int[] array) {
        if (idx == 0) {
            return nums[idx];
        } else if (idx < 0) {
            return 0;
        }
        if (array[idx] != -1) {
            return array[idx];
        }
        int pick = nums[idx] + findMax(idx - 2,array);
        int notPick = findMax(idx - 1,array);
        int temp = Math.max(pick, notPick);
        array[idx] = temp;
        return temp;
    }

}
