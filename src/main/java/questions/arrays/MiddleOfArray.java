package questions.arrays;

public class MiddleOfArray {
    public static int[] middle(int[] array) {
        if (array.length%2==0) {
            return new int[]{array[array.length / 2 - 1], array[array.length / 2]};
        } else {
            return new int[]{array[array.length/2]};
        }
    }
}
