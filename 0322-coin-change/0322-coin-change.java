class Solution {
    public int coinChange(int[] coins, int amount) {
        int n  = coins.length;
        int [][]dp = new int[n][amount+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        int result  = solve(0,coins,amount,dp);

        if(result==Integer.MAX_VALUE){
            return -1;
        }
       return result;
    }

  public int solve(int idx, int []coins, int amount,int[][]dp){


        if(amount==0){
            return 0;
        }

         if(amount <0){
            return Integer.MAX_VALUE;
         }
                 if(idx==coins.length){
            return Integer.MAX_VALUE;
         }

          if(dp[idx][amount] != -1){
            return dp[idx][amount];
          }

         int result   = solve(idx,coins,amount-coins[idx],dp);
           int take  = Integer.MAX_VALUE;
               if(result != Integer.MAX_VALUE){
                take  = 1+result;
               }   
           int skip = solve(idx+1,coins,amount,dp);


           return dp[idx][amount]= Math.min(take,skip);
    }
}