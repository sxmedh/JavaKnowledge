package questions.arrays;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int ptr = 0;
        for (int i = 0; i <= nums.length; i++) {
            if (nums[ptr]==0) {
                return ptr;
            }
            int temp = nums[ptr];
            nums[ptr] = 0;
            ptr = temp;
        }
        return -1;
    }
}
