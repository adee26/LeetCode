package amazon;

import java.util.Set;

public class StringSegmentation {

    public boolean canSegmentString(String s, Set<String> dictionary) { //applepie
        if(dictionary.contains(s)) {
            return true;
        }

        for (int i = 0; i<s.length(); i++) {
            String subString = s.substring(0, i);

            if (dictionary.contains(subString)) {
                String newSubString = s.substring(i);
                return canSegmentString(newSubString, dictionary);
            }

        }

        return false;
    }
}
