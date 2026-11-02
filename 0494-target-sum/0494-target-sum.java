class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(0,0,nums,target);

    }

        private int backtrack(int index,int currentSum ,int [] nums, int target){
     
                      if(index == nums.length){
                        if(currentSum == target){
                            return 1;
                        }
                        return 0;
                      }



                  int add =    backtrack(index + 1,
                            currentSum + nums[index],
                            nums,
                            target);

                  int subtract =    backtrack(index+1,currentSum-nums[index],nums,target);







            return add + subtract;



    }
}