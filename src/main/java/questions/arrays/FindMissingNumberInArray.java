package questions.arrays;

public class FindMissingNumberInArray {

    static int sumTillN(int n) {
        return (n * (n + 1) / 2);
    }

    static int findMissingNumberInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return -1;
    }
}
