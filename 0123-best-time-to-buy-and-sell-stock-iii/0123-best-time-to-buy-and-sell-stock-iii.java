class Solution {
    public int maxProfit(int[] prices) {
          int n  = prices.length;
       int [][][]dp = new int[n][2][3];
       for(int i=0; i<n; i++){
        for(int j=0; j<2; j++){
        Arrays.fill(dp[i][j],-1);
       }

       }  
        return solve(0,prices,1,2,dp);
    }


    public int solve(int idx, int[]prices, int buy,int cap,int[][][]dp){


         if(idx==prices.length || cap==0){
              return 0;
         }
    
               if(dp[idx][buy][cap] != -1){
                   return dp[idx][buy][cap];
               }
      if(buy==1){

         int take  = -prices[idx]+solve(idx+1,prices,0,cap,dp);
         int nottake=  solve(idx+1,prices,1,cap,dp);
                 return  dp[idx][buy][cap] = Math.max(take,nottake);
      }else{


          int sale  = prices[idx]+solve(idx+1,prices,1,cap-1,dp);
          int notsale  = solve(idx+1,prices,0,cap,dp);


          return dp[idx][buy][cap]= Math.max(sale,notsale);
      }

    }
}