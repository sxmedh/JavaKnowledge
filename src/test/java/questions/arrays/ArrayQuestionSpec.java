package questions.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayQuestionSpec {

    @Test
    void middleOfTheArray() {
        assert (Arrays.equals(MiddleOfArray.middle(new int[]{1, 2, 3, 4}), new int[]{2, 3}));
    }
}
