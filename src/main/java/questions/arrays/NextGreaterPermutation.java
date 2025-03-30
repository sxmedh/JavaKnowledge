package questions.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NextGreaterPermutation {
    public static int[] nextGreaterPermutation(int[] nums) {
        List<Integer> A = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        int n = A.size(); // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(A);
        } else {
            // Step 2: Find the next greater element
            //         and swap it with A[ind]:
            for (int i = n - 1; i > ind; i--) {
                if (A.get(i) > A.get(ind)) {
                    int tmp = A.get(i);
                    A.set(i, A.get(ind));
                    A.set(ind, tmp);
                    break;
                }
            }

            // Step 3: reverse the right half:
            List<Integer> sublist = A.subList(ind + 1, n);
            Collections.reverse(sublist);
        }

        return nums;
    }
}
