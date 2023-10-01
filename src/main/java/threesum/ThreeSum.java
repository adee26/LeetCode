package threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    /**
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
     * i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     * Notice that the solution set must not contain duplicate triplets.
     * Example 1:
     * Input: nums = [-1,0,1,2,-1,-4] //
     * Output: [[-1,-1,2],[-1,0,1]]
     * Explanation:
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     * The distinct triplets are [-1,0,1] and [-1,-1,2].
     * Notice that the order of the output and the order of the triplets does not matter.
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i<nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            int sumNeeded = - nums[i];
            for (int j = i+1; j<nums.length; j++) {
                int sumComplement = sumNeeded-nums[j];
                if(set.contains(sumComplement)) {
                    ArrayList<Integer> pairsNew = new ArrayList<>(Arrays.asList(nums[i], nums[j], sumComplement));
                    Collections.sort(pairsNew);
                    if(!pairs.contains(pairsNew)) {
                        pairs.add(pairsNew);
                    }
                }else{
                    set.add(nums[j]);
                }
            }

        }

        return pairs;
    }

}
