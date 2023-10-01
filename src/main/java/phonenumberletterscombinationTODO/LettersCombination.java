package phonenumberletterscombinationTODO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LettersCombination {
    /**
     * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number
     * could represent. Return the answer in any order.
     * A mapping of digits to letters (just like on the telephone buttons) is given below.
     * Note that 1 does not map to any letters.
     * ex: 23 -> ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     */

    public static List<String> lettersCombination(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "xyz");

        List<String> combinations = new ArrayList<>();

        for (char c : digits.toCharArray()) {
            String charsPossible = map.get(c);

        }

        return combinations;
    }
}
