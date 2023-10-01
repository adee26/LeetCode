package longestCommonPrefix;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     * Example 1:
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     */

    public static String longestCommonPrefix(String[] strings) {
        char[] chars = strings[0].toCharArray();
        String longestPrefix = "";
        boolean isCommon = true;
        int index = 0;
        while (isCommon) {
            for (String s : strings) {
                if(index >= s.length()) {
                    return longestPrefix;
                }
                if(s.charAt(index) != chars[index]) {
                    isCommon = false;
                }
            }
            if(isCommon){
                longestPrefix = longestPrefix + chars[index];
            }
            index++;
        }
        return longestPrefix;
    }


}
