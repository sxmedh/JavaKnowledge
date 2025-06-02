package questions.hashmap;

import org.junit.jupiter.api.Test;

public class HashMapQuestions {

    @Test
    void majorityElement() {
        var majority = new MajorityElement();
        assert majority.majorityElement(new int[]{2,2,1,1,1,2,2}) == 2;
    }
}
