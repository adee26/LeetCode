package arraysandstring;

import java.util.ArrayList;

public class OneAway {
    /**
     * There are three types of edits that can be performed on strings: insert a character,
     * remove a character, or replace a character. Given two strings, write a function to check if they are
     * one edit (or zero edits) away.
     * EXAMPLE
     * pale, ple -> true
     * pales, pale -> true
     * pale, bale -> true
     * pale, bake -> false
     * If length is equal and one ch is different -> true
     */
    public static boolean isOneAway(String s1, String s2) {
        if(s1.length() - s2.length() > 1 || s2.length() - s1.length() > 1) {
            return false;
        }
        if(s1.equals(s2)) {
            return true;
        }
        ArrayList<Character> s1Chars = new ArrayList<>();
        for (char c : s1.toCharArray()) {
            s1Chars.add(c);
        }

        int diff = 0;
        for (Character c : s2.toCharArray()) {
            if(!s1Chars.contains(c)) {
                diff++;
            }else{
                s1Chars.remove(c);
            }
        }

        return (diff <= 1 && s1.length() == s2.length()) ||
                (diff == 0 && (s1.length() - s2.length() < 2 || s2.length() - s1.length() <2));
    }
}
