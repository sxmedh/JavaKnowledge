package questions.recursion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Recursion {
    @Test
    void testSubsetWithInput123() {
        SubsetOne subsetOne = new SubsetOne();
        int[] input = {1, 2, 3};
        List<List<Integer>> result = subsetOne.subset(input);

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(1, 2),
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3),
                Arrays.asList(2),
                Arrays.asList(2, 3),
                Arrays.asList(3)
        );

        assertTrue(result.containsAll(expected));
        assertEquals(expected.size(), result.size());
    }
}
