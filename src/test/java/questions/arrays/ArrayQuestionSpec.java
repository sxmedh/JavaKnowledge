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

    @Test
    void removeDuplicated() {
        int[] array = {1, 1, 2, 2, 3, 4, 5};
        int[] nonDuplicateArray = RemoveDuplicates.removeDuplicates(array);
        assert(Arrays.equals(nonDuplicateArray, new int[]{1,2,3,4,5}));
    }

    @Test
    void removeDuplicateFromSorted() {
        int[] array = new int[]{ 1, 1, 2 };
        int size = RemoveDuplicatesFromSorted.removeDuplicates(array);
        assert (size==2);
    }

    @Test
    void bestTimeToBuyAndSell() {
        int[] array = new int[]{7, 1, 5, 3, 6, 4};
        BestTimeToBuyAndSell bst = new BestTimeToBuyAndSell();
        int profit = bst.maxProfit(array);
        int profit2 = bst.maxProfitInNComplexity(array);
        assert (profit == 5);
        assert (profit == profit2);
    }

    @Test
    void twoSum() {
        int[] array = new int[]{2,7,11,15};
        TwoSum twoSum = new TwoSum();
        assert (Arrays.equals(twoSum.twoSum(array,9),new int[]{0,1}));
    }

    @Test
    void permutation() {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,4,3,2,1,0};
        Permutation permutation = new Permutation();
        assert (!permutation.permutation(array1, array2));
    }

    @Test
    void rotateMatrix() {
        int[][] array = new int[3][3];
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = count;
                count++;
            }
        }
        RotateMatrixBy90 matrix = new RotateMatrixBy90();
        int[][] rotated = matrix.rotateMatrix(array);
        int[][] answer = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assert (Arrays.deepEquals(answer, rotated));
    }

    @Test
    void singleNumber() {
        int[] nums = {4, 1, 2, 1, 2};
        SingleNumber singleNumber = new SingleNumber();
        int answer = singleNumber.singleNumber(nums);
        assert (answer == 4);
    }
}

