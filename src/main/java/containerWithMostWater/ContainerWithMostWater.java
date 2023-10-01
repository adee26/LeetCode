package containerWithMostWater;

public class ContainerWithMostWater {
    /**
     * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
     * of the ith line are (i, 0) and (i, height[i]).
     * Find two lines that together with the x-axis form a container, such that the container contains the most water.
     * Return the maximum amount of water a container can store.
     * Notice that you may not slant the container.
     * Ex: Input: height = [1,8,6,2,5,4,8,3,7]
     *     Output: 49 (8-7)
     *
     */
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int distance = 0;
        for (int i = 0; i<height.length; i++) {
            for (int j = i+1; j<height.length; j++) {
                distance++;
                if(height[i] > height[j]) {
                    if(height[j] * distance > maxArea) {
                        maxArea = height[j] * distance;
                    }
                }else{
                    if(height[i] * distance > maxArea) {
                        maxArea = height[i] * distance;
                    }
                }

            }
            distance = 0;
        }
        return maxArea;
    }

    public static int maxAreaTwoPointers(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        int distance = right - left;


        while (left < right) {
            if (height[left] > height[right]){
                if(height[right] * distance > maxArea) {
                    maxArea = height[right] * distance;
                }
            }else{
                if(height[left] * distance > maxArea) {
                    maxArea = height[left] * distance;
                }
            }
            if(height[left] > height[right]) {
                right--;
            }else{
                left++;
            }
            distance--;
        }

        return maxArea;
    }
}

