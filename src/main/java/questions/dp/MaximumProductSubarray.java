package questions.dp;

import java.util.Arrays;

public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int max = max(nums);
        int currMax = 1;
        int currMin = 1;
        for (int n: nums) {
            int temp = currMax * n;
            currMax = Math.max(temp, Math.max(currMin * n, n));
            currMin = Math.min(temp, Math.min(currMin * n, n));
            max = Math.max(max, currMax);
        }
        return max;
    }

    public int max(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }


}
