class Solution {
    public int minInsertions(String s) {


          int n   = s.length();
int [][]dp = new int[n][n+1];
for(int i=0; i<n; i++){
    Arrays.fill(dp[i],-1);
}
  return solve(0,n-1,s,dp);
    }




public int solve(int i, int j,  String s ,int[][]dp){


    if(i>=j){
          return 0;
    }


  if(dp[i][j] != -1){
      return dp[i][j];
  }

        int take  = 0;

        if(s.charAt(i)==s.charAt(j)){
            take  = solve(i+1,j-1,s,dp);

            return dp[i][j] =  take;
        }
     int skip1 = 1+ solve(i+1,j,s,dp);
     int skip2 =  1+solve(i,j-1,s,dp);


       return dp[i][j] = Math.min(skip1,skip2);
           
    }
}