package arraysandstring;

import java.util.ArrayList;

public class URLify {
    /**
     * Write a method to replace all spaces in a string with '%20'. You may assume that the string
     * has sufficient space at the end to hold the additional characters, and that you are given the utrue"
     * length of the string. (Note: If implementing in Java, please use a character array so that you can
     * perform this operation in place.)
     * EXAMPLE
     * Input: "Mr John Smith ", 13
     * Output: "Mr%20John%20Smith"
     */
    public static String urlIfy(String s) {
        s = s.trim();
        ArrayList<Character> chars = new ArrayList<>();
        for (Character c : s.toCharArray()) {
            if(c.equals(' ')) {
                chars.add('%');
                chars.add('2');
                chars.add('0');
            }else{
                chars.add(c);
            }
        }
        String result = "";
        for (Character c : chars) {
            result = result + c;
        }
        return result;
    }
}
