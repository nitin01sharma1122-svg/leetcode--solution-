class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count; 
                }
            } else {
                count = 0; 
            }
            i++; 
        }

        return maxCount;
    }
}