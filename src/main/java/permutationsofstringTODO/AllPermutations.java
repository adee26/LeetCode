package permutationsofstringTODO;

import java.util.ArrayList;
import java.util.List;

public class AllPermutations {
    /**
     * Given a smaller string s and a bigger string b, design an algorithm to find all permutations
     * of the shorter string within the longer one. Print the location of each permutation.
     */
    public static List<String> findAllPermutations(String s1, String s2) {
        ArrayList<String> result = new ArrayList<>();
        if(s1.length() > s2.length()) {
            return result;
        }
        ArrayList<Character> chars = new ArrayList<>();
        for (char c : s1.toCharArray()) {
            chars.add(c);
        }

        String subString = s2.substring(0, s1.length());

        for (int i = 1; i<s2.length(); i++) {
            for (char c : subString.toCharArray()) {
                if(chars.contains(c)) {
                    result.add(subString);
                }
            }
            subString = s2.substring(i, s1.length() + i);
        }
        return result;
    }
}
