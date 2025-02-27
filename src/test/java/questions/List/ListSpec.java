package questions.List;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListSpec {

    @Test
    void pascalsTriangle() {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> result = pascalsTriangle.generate(5);

        Integer[][] expected = {
                {1},
                {1, 1},
                {1, 2, 1},
                {1, 3, 3, 1},
                {1, 4, 6, 4, 1}
        };
        // Convert List<List<Integer>> to Integer[][]
        Integer[][] resultArray = result.stream()
                .map(l -> l.toArray(new Integer[0]))
                .toArray(Integer[][]::new);
        // Use deepEquals for nested array comparison
        assertTrue(Arrays.deepEquals(resultArray, expected), "Pascals Triangle is incorrect");
    }
}
