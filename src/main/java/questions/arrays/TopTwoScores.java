package questions.arrays;

public class TopTwoScores {
    public static int[] findTopTwoScores(int[] array) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= first) {
                second = first;
                first = array[i];
            }
        }
        return new int[]{first, second};
    }
}
