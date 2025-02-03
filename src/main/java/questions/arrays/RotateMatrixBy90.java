package questions.arrays;

import java.util.ArrayList;

public class RotateMatrixBy90 {

    int[][] rotateMatrix(int[][] inputMatrix) {
        int answer[][] = new int[inputMatrix.length][inputMatrix.length];
        int n = inputMatrix.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; 0 <= j; j--) {
                list.add(inputMatrix[j][i]);
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = list.get(count);
                count++;
            }
        }
        return answer;
    }
}
