package questions.binarySearch;

import org.junit.jupiter.api.Test;

public class BinarySearchQuestions {

    @Test
    void binarySearch() {
        var binary = new BinarySearch();
        assert (binary.search(new int[]{1,2,3,4,5,6},1));
    }

    @Test
    void binary2DSearch() {
        var array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        var binary2d = new BinarySearchInTwoDArray();
        binary2d.searchMatrix(array,9);
    }
    
}
