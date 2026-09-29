class Solution {
    public boolean canPartition(int[] nums) {
       int n  = nums.length;
        
    
      int sum  = 0;
         for(int i=0; i<nums.length; i++){
             sum += nums[i];
        }

            if(sum % 2 != 0){
                return false;
            }
           int target  = sum / 2;

              int [][]dp =  new int[n][target+1];
       for(int i=0; i<n; i++){
        Arrays.fill(dp[i],-1);
       }
    
      return  solve(0,nums,target,dp);
    }


   
   public boolean solve(int idx, int []nums,int target,int [][]dp){
               
     if(target == 0){
              return true;
      }
      if(idx == nums.length){
            return false;
      }

         if(target<0){
            return false;
         }

       if(dp[idx][target] != -1){
             return dp[idx][target] == 1 ;
       }

           boolean take =     solve(idx+1,nums,target-nums[idx],dp);


        boolean skip  =       solve(idx+1,nums,target,dp);
        boolean  answer  = skip || take ;

         dp[idx][target]   = answer? 1:0;


         return answer;
    }
}