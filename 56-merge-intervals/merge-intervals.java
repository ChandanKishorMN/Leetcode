import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Edge case: if there's 1 or 0 intervals, no merging is needed
        if (intervals.length <= 1) {
            return intervals;
        }

        // 1. Sort the intervals by their starting values
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedList = new ArrayList<>();
        
        // Initialize with the first interval
        int[] currentInterval = intervals[0];
        mergedList.add(currentInterval);

        // 2. Iterate through the intervals and merge overlaps
        for (int[] nextInterval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];

            if (nextStart <= currentEnd) { 
                // Overlap found: Update the end time of the current interval
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else { 
                // No overlap: Move to the next interval and add it to the list
                currentInterval = nextInterval;
                mergedList.add(currentInterval);
            }
        }

        // 3. Convert the list back into a 2D array
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
