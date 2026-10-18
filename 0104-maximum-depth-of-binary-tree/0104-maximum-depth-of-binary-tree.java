class Solution {
    public int maxDepth(TreeNode root) {


      return dfs(root);
        
    }      

        public int   dfs(TreeNode root){
                   if(root  == null){
                         return 0;
               }
             


               int leftheight  = dfs(root.left);
               int rightheight = dfs(root.right);


                 return  Math.max(leftheight,rightheight)+1;

    }
}