package longestpalindromicsubstringTODO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestPalindromicSubstring {
    /**
     * Given a string s, return the longest
     * palindromic substring in s.
     * Example 1:
     * Input: s = "babad"    //b- 0,1 //a-1,3 // d-4
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * Example 2:
     * Input: s = "cbbd"
     * Output: "bb"
     */
    public static String longestPalindrome(String s) {
        HashMap<Character, List<Integer>> positions = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            char current = s.charAt(0);
            if(positions.containsKey(current)) {
                positions.get(current).add(i);
            }else{
                positions.put(current, new ArrayList<>(List.of(i)));
            }
        }

        String longestPalindrome = "";
        for (char c : positions.keySet()) {
            if(positions.get(c).size() > longestPalindrome.length()) {
                while (positions.get(c).size() > 1) {

                }
            }
        }
        //TODO

        return longestPalindrome;
    }
}
