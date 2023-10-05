package powersof2;

import java.util.ArrayList;
import java.util.List;

public class PowersOfTwo {

    public static List<Integer> powersOf2(int n) {
        List<Integer> result = new ArrayList<>();
        int pow = 1;
        while (pow <= n) {
            result.add(pow);
            pow = 2 * pow;
        }

        return result;
    }
}
