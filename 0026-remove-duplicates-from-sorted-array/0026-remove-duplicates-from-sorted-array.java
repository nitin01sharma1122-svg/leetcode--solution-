
       class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;  // unique element ka index

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
 
    }
