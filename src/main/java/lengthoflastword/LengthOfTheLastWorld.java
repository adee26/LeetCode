package lengthoflastword;

public class LengthOfTheLastWorld {
    public static int lengthOfTheLastWorld(String string) {
        if(string.equals("")) {
            return 0;
        }
        string = string.trim();
        for (int i = 0; i<string.length(); i++) {
            if(string.charAt(i) == ' ') {
                string = string.substring(i+1);
                i = -1;
            }
        }

        return string.length();
    }
}
