class Solution {
    public int maxProfit(int k, int[] prices) {
          int n  = prices.length;
       int [][][]dp = new int[n][2][k+1];
       for(int i=0; i<n; i++){
        for(int j=0; j<2; j++){
        Arrays.fill(dp[i][j],-1);
       }

       }  
        return solve(0,prices,1,k,dp);
    }


    public int solve(int idx, int[]prices, int buy,int k,int[][][]dp){


         if(idx==prices.length || k==0){
              return 0;
         }
    
               if(dp[idx][buy][k] != -1){
                   return dp[idx][buy][k];
               }
      if(buy==1){

         int take  = -prices[idx]+solve(idx+1,prices,0,k,dp);
         int nottake=  solve(idx+1,prices,1,k,dp);
                 return  dp[idx][buy][k] = Math.max(take,nottake);
      }else{


          int sale  = prices[idx]+solve(idx+1,prices,1,k-1,dp);
          int notsale  = solve(idx+1,prices,0,k,dp);


          return dp[idx][buy][k]= Math.max(sale,notsale);
      } 
    }
}