class Solution {
    public int minDepth(TreeNode root) {
         return dfs(root);
    }
    public  int dfs(TreeNode root){
          
          
          if(root == null){
              return 0;
          }
      
      if(root.left == null){
          return dfs(root.right)+1;
      }
      
      if(root.right == null){
          return dfs(root.left)+1;
      }
      int left  = dfs(root.left);
      int right = dfs(root.right);
      
      
      
     return Math.min(left,right)+1;
      
       
    }
}