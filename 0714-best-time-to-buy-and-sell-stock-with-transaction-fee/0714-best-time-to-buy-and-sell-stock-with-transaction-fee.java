class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int [][]dp = new int[n][2];
        for(int i=0; i<n; i++){
            
            Arrays.fill(dp[i],-1);
        }
        return  solve(0,prices,1,fee,dp);
    }

    public int solve(int idx, int []prices , int buy, int fee,int[][]dp){
 

             if(idx==prices.length ){
                  return 0;
             }        
         if(dp[idx][buy] != -1){
               return dp[idx][buy];
         }

     if(buy==1){
        int take  = -prices[idx]+solve(idx+1,prices,0,fee,dp);
        int nottake = solve(idx+1,prices,1,fee,dp);

             return  dp[idx][buy]  =  Math.max(take,nottake);
     }else{
        int sale = prices[idx]-fee+solve(idx+1,prices,1,fee,dp);
      int  notsale  = solve(idx+1,prices,0,fee,dp);

        return dp[idx][buy]  =  Math.max(sale,notsale);
     }

  
    }
}