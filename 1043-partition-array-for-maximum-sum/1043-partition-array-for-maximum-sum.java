class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int  n = arr.length;
      int [][]dp = new int [n][k+1];  
    for(int i=0; i<n; i++){
        Arrays.fill(dp[i],-1);
    }
  return solve(0,arr,k,dp);
    }
  
   public int solve(int idx, int []arr, int k,int[][]dp){
    
      int result  = 0;
      int currval = 0;
      if(idx==arr.length){
          return 0;
      }
          if(dp[idx][k] != -1){
              return dp[idx][k];
          }
    for(int j=idx; j<arr.length && j-idx+1<=k; j++ ){

        currval = Math.max(currval,arr[j]);
    
            
        
        result = Math.max(
                result,
                (j - idx + 1) * currval + solve(j + 1, arr, k,dp)
            );
   }
            return   dp[idx][k] =  result;

   }
}