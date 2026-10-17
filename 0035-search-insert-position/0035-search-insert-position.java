
       class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int mid;
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                l = mid+1;
                // r= mid-1;
                
            }else if(nums[mid] > target){
                // l = mid+1;
                r = mid-1;
                
            }
        }
        return l;
        
    }
} 
    