package competitive.arrays;

import org.junit.jupiter.api.Test;

public class ArraySpec {

    @Test
    void twoDArray(){
        TwoDArray twoDArray = new TwoDArray();
        int[][] array = twoDArray.generate2DArrayWithRandomNumbers(3,4);
        twoDArray.print2DArray(array,3,4);
    }
}
