package questions.arrays;

import java.util.ArrayList;

public class RemoveDuplicatesFromSorted {
    static public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
           if(nums[i] != nums[i+1]) {
               arrayList.add(nums[i]);
           }
        }
        if(nums[nums.length-1]!=nums[nums.length-2]) {
            arrayList.add(nums[nums.length-1]);
        }
        return arrayList.size();
    }
}
