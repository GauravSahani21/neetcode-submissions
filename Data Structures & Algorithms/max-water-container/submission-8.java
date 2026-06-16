class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int length = 0;
        int width = 0;
        int max = 0;

        while (left < right) {
            length = Math.min(heights[left], heights[right]);
            width = right - left;

            max = Math.max(max, length * width);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
