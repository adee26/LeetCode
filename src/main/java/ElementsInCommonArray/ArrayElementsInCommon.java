package ElementsInCommonArray;

public class ArrayElementsInCommon {

    /**
     * Given two sorted arrays, find the number of elements in common. The arrays are the same length
     * and each has all distinct elements.
     */
    public static int findElementsInCommon(int[] arr1, int[] arr2) {
        int result = 0;
        int index = 0;
        int current = arr1[index];
        for (int i = 0; i<arr2.length; i++) {
            if(arr2[i] == current) {
                result++;
            }
        }
        return result;
    }
}
