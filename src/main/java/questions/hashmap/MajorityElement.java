package questions.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.computeIfPresent(num, (_, value) -> value + 1);
            map.putIfAbsent(num, 1);
        }
        return map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();

    }

}
