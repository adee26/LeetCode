package arraysandstring;

public class StringCompression {
    /**
     * Implement a method to perform basic string compression using the counts
     * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
     * "compressed" string would not become smaller than the original string, your method shouId return
     * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
     */
    public static String compressString(String s) {
        if(s.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char current = s.charAt(0);

        for (Character c : s.toCharArray()) {
            if(c.equals(current)) {
                count++;
            }else{
                sb.append(current);
                sb.append(count);
                current = c;
                count = 1;
            }
        }
        sb.append(current);
        sb.append(count);
        return sb.toString();
    }
}
