class Solution {
    public boolean isMatch(String s, String p) {
        int  n  = s.length();
        int  m =  p.length();

        int [][]dp = new int[n][m];
        for(int i= 0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }

     return solve(0,0,s,p,dp);
    }
   
  public  boolean solve(int i, int j, String s , String p,int[][]dp){

  if( i== s.length()&&  j== p.length()){
        return true;
  }
      if(j==p.length()){
          return false;
      }
         

 
             if(i==s.length()){
                if(p.charAt(j) == '*'){
                    return solve(i,j+1,s,p,dp);
                }
                return false;
             }
            
            if(dp[i][j] != -1){
                return dp[i][j]==1;
            }
            boolean ans ;
       if(s.charAt(i)==p.charAt(j) ||  p.charAt(j)=='?'){
              ans =  solve(i+1,j+1,s,p,dp);

                
       }
      

     else if(p.charAt(j) == '*'){
         boolean  skip1  =  solve(i+1,j,s,p,dp);

         boolean  skip2  =   solve(i,j+1,s,p,dp);
      
            ans  =    skip1 || skip2;
      }
      else{

        ans  =  false;
      }
        dp[i][j] = ans ? 1 : 0;

        return ans;

    }
}