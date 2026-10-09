class Solution {
    public int maxProfit(int[] prices) {
        
      
  return  solve(0,prices,Integer.MAX_VALUE);
      
    }



   public int solve(int idx, int[]prices,int minprice){


           if(idx==prices.length){
                  return 0;
           }
             
    minprice  = Math.min(minprice,prices[idx]);

        int profit  = prices[idx]-minprice;

       int futureprofit =    solve(idx+1,prices, minprice);
       
       

          return   Math.max(futureprofit,profit);



    }
}