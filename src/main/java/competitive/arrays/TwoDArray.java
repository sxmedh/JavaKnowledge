package competitive.arrays;

import java.util.Random;

public class TwoDArray {

    int[][] getNxMSizeArray(int row, int col) {
        return new int[row][col];
    }

    int[][] populate2DArray(int[] array, int row, int col) {
        if (array.length != row * col) throw new RuntimeException("array element mismatch");
        int[][] array2D = getNxMSizeArray(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array2D[i][j] = array[i*col + j];
            }
        }
        return array2D;
    }

    int[] generateArrayWithRandomNumbers(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(10) + 1;
            array[i] = randomNumber;
        }
        return array;
    }

    int[][] generate2DArrayWithRandomNumbers(int row, int col) {
        int[] array = generateArrayWithRandomNumbers(row * col);
        return populate2DArray(array, row, col);
    }
}
