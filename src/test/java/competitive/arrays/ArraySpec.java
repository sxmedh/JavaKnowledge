package competitive.arrays;

import org.junit.jupiter.api.Test;

public class ArraySpec {

    @Test
    void twoDArray(){
        TwoDArray twoDArray = new TwoDArray();
        int[][] array = twoDArray.generate2DArrayWithRandomNumbers(3,4);
        for (int i = 0;i < 3;i++) {
            for(int j = 0;j < 4;j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
