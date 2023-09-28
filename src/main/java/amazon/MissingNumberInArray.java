package amazon;

public class MissingNumberInArray {

    /**
     * You are given an array of positive numbers from 1 to n,
     * such that all numbers from 1 to n are present except one number x. You have to find x.
     */

    public int findMissingNumber(int[] array){ // 3 7 1 2 8 4 5 - missing 6
        int expectedSum = (array.length + 1) * (array.length + 2) / 2;
        int actualSum = 0;
        for (int n : array) {
            actualSum = actualSum + n;
        }

        return expectedSum-actualSum;
    }
}
