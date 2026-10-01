class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
    int n = nums.length;
    int totalsum = 0;
    for(int i=0; i<n; i++){
        totalsum += nums[i];
    }

     int offset = totalsum;
   int [][]dp = new int[n][2*offset+1];
   for(int i=0; i<n; i++){
    Arrays.fill(dp[i],-1);
   }
    

return solve(0,0,nums,target,dp,offset);


    }
  private int solve(int idx,int currsum ,int []nums,int target,int[][]dp,int offset){

     if(idx == nums.length){
        if(currsum == target){
            return 1;
        }


        return 0;
     }
      int dpindex = currsum+offset; 
        if(dp[idx][dpindex] != -1){
            return dp[idx][dpindex];
        }

  
   
        int add = solve(idx+1,currsum+nums[idx],nums,target,dp,offset);


        int sub = solve(idx+1,currsum-nums[idx],nums,target,dp,offset);

      

        return dp[idx][dpindex]= add+sub;

    }
}