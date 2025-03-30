package questions.arrays;

public class KadaneAlgo {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int it: nums) {
            if (it > max) {
                max = it;
            }
            if (sum + it > 0) {
                sum += it;
            } else {
                sum = 0;
            }
            if (sum > max && sum != 0) {
                max = sum;
            }
        }
        return max;
    }
}
