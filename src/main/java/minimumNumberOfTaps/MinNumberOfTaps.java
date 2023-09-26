package minimumNumberOfTaps;

import java.util.HashMap;

public class MinNumberOfTaps {

    /**
     * There is a one-dimensional garden on the x-axis. The garden starts at the point 0 and ends at the point n. (i.e., the length of the garden is n).
     * There are n + 1 taps located at points [0, 1, ..., n] in the garden.
     * Given an integer n and an integer array ranges of length n + 1 where ranges[i] (0-indexed) means the i-th tap can water the area [i - ranges[i], i + ranges[i]] if it was open.
     * Return the minimum number of taps that should be open to water the whole garden, If the garden cannot be watered return -1.
     * --
     * ex: Input: n = 5, ranges = [3,4,1,1,0,0]
     * Output: 1
     * Explanation: The tap at point 0 can cover the interval [-3,3]
     * The tap at point 1 can cover the interval [-3,5]
     * The tap at point 2 can cover the interval [1,3]
     * The tap at point 3 can cover the interval [2,4]
     * The tap at point 4 can cover the interval [4,4]
     * The tap at point 5 can cover the interval [5,5]
     * Opening Only the second tap will water the whole garden [0,5]
     */

    public static int returnMinNumberOfTaps(int n, int[] ranges) {
        int minLeft = 0;
        int minRight = 0;

        int minTaps = n;

        for (int i = 0; i<ranges.length; i++) {
            int leftRange = i - ranges[i] - 1;
            int rightRange = i + ranges[i] + 1;

            minLeft = returnLeftRangeMin(0, ranges, leftRange);
            minRight = returnRightRangeMin(n,1, ranges, rightRange);

            if(minLeft + minRight == 1) {
                return 1;
            }else if(minLeft + minRight < minTaps){
                minTaps = minLeft + minRight;
            }

        }

        return minLeft + minRight == 0 || minLeft + minRight >= n ? -1 : minTaps;
    }

    private static int returnRightRangeMin(int n, int minRight, int[] ranges, int rightRange) {
        if (rightRange <= n) {
            if (ranges[rightRange] == 0) {
                minRight++;
                if(rightRange < n){
                    rightRange++;
                }
            }
            rightRange = rightRange + ranges[rightRange];
            minRight++;
            minRight = returnRightRangeMin(n, minRight, ranges, rightRange+1);
        }

        return minRight;
    }

    private static int returnLeftRangeMin(int minLeft, int[] ranges, int leftRange) {
        if(leftRange > 0) {
            if (ranges[leftRange] == 0){
                minLeft++;
                leftRange--;
            }

            leftRange = leftRange - ranges[leftRange];
            minLeft++;
            minLeft = returnLeftRangeMin(minLeft, ranges, leftRange-1);
        }

        return minLeft;
    }
}
