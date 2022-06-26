package org.containerWithMostWater;

public class ContainerWithMostWater {


    /**
     * You are given an integer array height of length n. There are n vertical lines drawn
     * such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
     * @param height of int[]
     * @return maxarea int.
     */
    public int maxArea(int[] height) {
            int maxarea = 0;
            for (int i = 0; i < height.length; i++) {
                for (int j = i+1; j < height.length; j++) {
                    maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j-i));
                }
            }
            return maxarea;
        }


}
