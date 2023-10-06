package permutationsofstringTODO;

import java.util.ArrayList;
import java.util.Iterator;

public class PermutationsOfString {
    /**
     * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
     * In other words, return true if one of s1's permutations is the substring of s2.
     * Example 1:
     * Input: s1 = "ab", s2 = "eidbaooo"
     * Output: true
     * Explanation: s2 contains one permutation of s1 ("ba").
     */
    public static boolean checkInclusion(String s1, String s2) {
        ArrayList<Character> listS1 = new ArrayList<>();
        for (char c : s1.toCharArray()) {
            listS1.add(c);
        }

        int counter = 0;
        int iteration = -1;

        ArrayList<Character> temp = new ArrayList<>();

        for (int i = 0; i<s2.length(); i++) {
            iteration++;
            if(listS1.contains(s2.charAt(i))) {
                counter++;
                temp.add(s2.charAt(i));
                listS1.remove((Character) s2.charAt(i));
                if(counter == s1.length()) {
                    return true;
                }
            }else {
                Iterator<Character> iterator = temp.iterator();
                while (iterator.hasNext()) {
                    listS1.add(iterator.next());
                    iterator.remove();
                }
                iteration = iteration - counter;
                counter = 0;
                i = iteration;
            }
        }
        return false;
    }

    public static boolean checkAllPermutations(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }

        int sumChars = 0;
        ArrayList<Character> chars = new ArrayList<>();
        for (char c : s1.toCharArray()) {
            chars.add(c);
            sumChars = sumChars+c;
        }
        int rightLimit = s1.length();
        String substring = s2.substring(0, rightLimit);
        for (int i = 1; i<s2.length(); i++) {
            int sumS2 = 0;
            for (char c : substring.toCharArray()) {
                sumS2 = sumS2 + c;
            }
            if(sumS2 == sumChars) {
                return true;
            }
            rightLimit++;
            if(rightLimit > s2.length()){
                return false;
            }
            substring = s2.substring(i, rightLimit);
        }
        return false;
    }

}
