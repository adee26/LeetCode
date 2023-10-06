package arraysandstring;

import java.util.HashMap;

public class PalindromePermutation {
    /**
     * Given a string, write a function to check if it is a permutation of a palindrome.
     * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
     * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
     * EXAMPLE
     * Input: Tact Coa
     * Output: True (permutations: "taco cat", "atco cta", etc.)
     * if(length % 2 == 0) -> all characters even; else - one odd
     */
    public static boolean isPermutationOfPalindrome(String s){
        HashMap<Character, Integer> charsCount = new HashMap<>();
        s = s.toLowerCase();
        int spaceCount = 0;
        for (Character c : s.toCharArray()) {
            if(c == ' '){
                spaceCount++;
                continue;
            }
            if(charsCount.containsKey(c)) {
                charsCount.put(c, charsCount.get(c) + 1);
            }else{
                charsCount.put(c, 1);
            }
        }
        int oddCount = 0;
        for (char c : charsCount.keySet()) {
            if(s.length()-spaceCount % 2 == 0) {
                if(charsCount.get(c) % 2 != 0) {
                    return false;
                }
            }else{
                if(charsCount.get(c) % 2 != 0){
                    oddCount++;
                }
                if(oddCount > 1) {
                    return false;
                }
            }
        }
        return true;
    }

}
