/*
 This code runs on LeetCode only.
 There is no main() method here because LeetCode
 already has its own main class.

 To run this code in your editor,
 create a main class and call this function.
*/

class ContainMostWater {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length - 1;

        while (lp < rp) {
            int ht = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }
}
