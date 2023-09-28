package amazon;

public class ReverseStringsInASentence {

    /**
     * Reverse the order of words in a given sentence (an array of characters).
     */
    public String reverseString(String s) {
        String[] strings = s.split("\\s+");
        String newString = "";

        for (int i = strings.length - 1; i>=0; i--) {
            if (i == 0) {
                return newString + strings[i];
            }
            newString = newString + strings[i] + " ";
        }

        return newString;
    }
}
