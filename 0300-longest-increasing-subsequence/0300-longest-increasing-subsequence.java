class Solution {
    public int lengthOfLIS(int[] nums) {
   int n  = nums.length;
  int [][]dp = new int[n][n+1];

  for(int i=0; i<n; i++){
    Arrays.fill(dp[i],-1);
  }



   return solve(0,nums,-1,dp);

    }



      public  int solve(int idx, int []nums, int previdx,int [][]dp){


        if(idx==nums.length){
              return 0;
        }
          if(dp[idx][previdx+1] != -1){

          return dp[idx][previdx+1];
}        


     int skip =   solve(idx+1,nums,previdx,dp);

              int take = 0;
           if (previdx == -1 || nums[idx] > nums[previdx]) {
    take = 1 + solve(idx + 1, nums, idx, dp);
}

        return dp[idx][previdx+1] = Math.max(take,skip);
    }
}