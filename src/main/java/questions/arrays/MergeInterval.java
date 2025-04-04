package questions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

    int count = 0;
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];  // Sort by first element ascending
            } else {
                return a[1] - b[1];  // If first elements are equal, sort by second element
            }
        });

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] >= intervals[i+1][1] && intervals[i][1] >= intervals[i+1][0]) {
                intervals[i+1][0] = intervals[i][0];
                intervals[i+1][1] = intervals[i][1];
                intervals[i][0] = -1;
                count++;
            } else if (intervals[i][1] >= intervals[i+1][0]) {
                intervals[i+1][0] = intervals[i][0];
                intervals[i][0] = -1;
                count++;
            }
        }

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];  // Sort by first element ascending
            } else {
                return a[1] - b[1];  // If first elements are equal, sort by second element
            }
        });

        return Arrays.copyOfRange(intervals, count, intervals.length);
    }

}
