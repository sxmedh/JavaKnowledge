package questions.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public boolean search(int[] array, int element) {
        if (0 == array.length) {
            return false;
        }
        int mid = array.length / 2;
        if (array[mid] == element) {
            return true;
        }
        if (element < array[mid]) {
            return search(Arrays.copyOfRange(array, 0, mid), element);
        } else {
            return search(Arrays.copyOfRange(array, mid + 1, array.length), element);
        }

    }
}
