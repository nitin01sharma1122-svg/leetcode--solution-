class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
   int m  = matrix.length;
             int n = matrix[0].length;
              int [][]dp = new int[m][n];
              for(int i=0; i<m; i++){
                Arrays.fill(dp[i],Integer.MAX_VALUE);
              }
               int ans  = Integer.MAX_VALUE;
               for(int j=0; j<n; j++){
                ans  = Math.min(ans,solve(0,j,matrix,dp));
               }
           return   ans;


    }       
      


     public int solve(int i, int j, int[][]matrix,int [][]dp){

           if(j<0 ||  j>=matrix[0].length){
                   return 1000000000;

               }
                 if(i==matrix.length-1){
             return matrix[i][j];
        } 
         if(dp[i][j] != Integer.MAX_VALUE){
            return dp[i][j];
         }
            
       int down   = matrix[i][j]+solve(i+1,j,matrix,dp);

       int diagonallyleft  = matrix[i][j]+solve(i+1,j-1,matrix,dp);

       int diagonallyright = matrix[i][j]+solve(i+1,j+1,matrix,dp);


       int    minsum  =  Math.min(down,Math.min(diagonallyleft,diagonallyright));

           return    dp[i][j] = minsum;




    }
}