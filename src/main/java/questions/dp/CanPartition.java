package questions.dp;

public class CanPartition {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        int n = nums.length;
        Boolean[][] memo = new Boolean[n][target + 1];

        return func(n - 1, nums, target, memo);
    }

    boolean func(int idx, int[] nums, int sum, Boolean[][] memo) {
        if (sum == 0) return true;
        if (idx < 0 || sum < 0) return false;

        if (memo[idx][sum] != null) return memo[idx][sum];

        boolean pick = func(idx - 1, nums, sum - nums[idx], memo);
        boolean notPick = func(idx - 1, nums, sum, memo);

        return memo[idx][sum] = pick || notPick;
    }
}
