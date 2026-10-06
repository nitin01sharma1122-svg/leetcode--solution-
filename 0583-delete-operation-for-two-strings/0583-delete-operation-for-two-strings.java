class Solution {
    public int minDistance(String word1, String word2) {
        
    int n  = word1.length();
  int  m  = word2.length();
  int [][]dp = new int[n][m+1];
  for(int i=0; i<n; i++){
    Arrays.fill(dp[i],-10);
  }
    return solve(n-1,m-1,word1,word2,dp);
    }








  public int solve(int i,int j, String word1,String word2,int[][]dp){

       if(j==-1){
         return i+1;
       }
     
       if(i==-1){
          return j+1;
       }

         if(dp[i][j] != -10){
             return dp [i][j];
         }
      int take = 0;
      if(word1.charAt(i)==word2.charAt(j)){
        take = solve(i-1,j-1,word1,word2,dp);
           return take;
      }
     int skip1 = 1+solve(i-1,j,word1,word2,dp);
     int skip2 = 1+solve(i,j-1,word1,word2,dp);


    return dp[i][j] =  Math.min(skip1,skip2);

  



  
   








         

    }
}