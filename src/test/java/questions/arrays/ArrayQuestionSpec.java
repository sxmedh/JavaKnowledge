package questions.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayQuestionSpec {

    @Test
    void middleOfTheArray() {
        assert (Arrays.equals(MiddleOfArray.middle(new int[]{1, 2, 3, 4}), new int[]{2, 3}));
    }

    @Test
    void sumOfDiagonal() {
        assert (SumOfDiagonal.sumDiagonalElements(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}) == 15);
    }

    @Test
    void findTopTwoScores() {
        assert (Arrays.equals(TopTwoScores.findTopTwoScores(new int[]{84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0}), new int[]{90, 87}));
        assert (Arrays.equals(TopTwoScores.findTopTwoScores(new int[]{84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 90}), new int[]{90, 90}));
    }

    @Test
    void findMissingNumber() {
        assert (FindMissingNumberInArray.findMissingNumberInArray(new int[]{1, 2, 3, 4, 6}) == 5);
    }
}
