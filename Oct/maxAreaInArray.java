class Solution {
   public static int maxArea(int[] array) {
        int len = array.length;
        int max = 0;
        int left = 0;
        int right = len - 1;
        
        while (left < right) {
            int height = Math.min(array[left], array[right]);
            int width = right - left;
            int area = height * width;
            
            max = Math.max(max, area);
            
            if (array[left] < array[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return max;
    }
}
