class Solution {
    public int rob(int[] nums) {
       int n = nums.length;
   int [] dp = new int[n+1];
   Arrays.fill(dp,-1);
      return solve(0,nums,dp);

    }
 public int solve(int idx, int []nums,int [] dp){
       
          
   int sum  = 0;
      
    if(idx==nums.length-1){
      return   nums[idx];
    }


    if(idx>nums.length-1){
        return 0;
    }
   

       if(dp[idx] != -1){
        return dp[idx];
       }
        int take = nums[idx]+solve(idx+2,nums,dp);

        int  skip = solve(idx+1,nums,dp);
      
         sum = Math.max(take,skip);


           return   dp[idx] = sum;
    }
}