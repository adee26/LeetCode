package amazon;

import java.util.ArrayList;
import java.util.List;

public class FindSumInArray {

    /**
     * Given an array of integers and a value, determine if there are any two integers in the array whose sum is equal
     * to the given value.
     * Return true if the sum exists and return false if it does not. Consider this array and the target sums:
     */
    public boolean findIfSumExists(int target, int[] nums){
        List<Integer> integers = new ArrayList<>();

        for (int num : nums){
            if(integers.contains(target - num)){
                return true;
            }else{
                integers.add(num);
            }
        }

        return false;
    }
}
