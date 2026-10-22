
        class Solution {
   List<List<String>> ans = new ArrayList<>();
   int N; 
    
    
    public List<List<String>> solveNQueens(int n) { 
        N= n;
           char[][] board = new char[n][n];

           for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                board[i][j] = '.';
            }
           }

           solve(board,0);
           return ans;
    }
           





       private void solve(char[][] board,int row){

        if(row== N){
            ans.add(construct(board));
                return;
        }
        
        for(int col = 0; col<N; col++){
            if(isvalid(board,row,col)){

                board[row][col] = 'Q';
                solve(board,row+1);

                board[row][col] = '.';
            }
        }
       }  

       private boolean  isvalid(char[][] board, int row , int col){
        for(int i= 0; i<row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }


                 for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

                    return true;
                }
            private List<String> construct(char[][] board) {

        List<String> res = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            res.add(new String(board[i]));
        }

        return res;
                
            
    
        
    }
}
    