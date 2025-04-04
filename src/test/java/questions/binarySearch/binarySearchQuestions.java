package questions.binarySearch;

import org.junit.jupiter.api.Test;

public class binarySearchQuestions {

    @Test
    void binarySearch() {
        var binary = new BinarySearch();
        assert (binary.search(new int[]{1,2,3,4,5,6},1));
    }
    
}
