class Solution {
    public boolean isBalanced(TreeNode root) {
        
        return   ispossible(root);   
        

    }
        public int   dfs(TreeNode root){
            if(root  == null){
            return 0;
        }

        

        int leftheight  = dfs(root.left);
        int rightheight = dfs(root.right);


        int height  = Math.max(leftheight,rightheight)+1;

             return height;
        
        }


   public boolean ispossible(TreeNode root){
           
            if(root  == null){
            return true;
        }

          
        int leftheight  = dfs(root.left);
        int rightheight = dfs(root.right);


       int difference   =   Math.abs(leftheight - rightheight);


            if(difference > 1){
                return false;
            }

       
         return ispossible(root.left)  && ispossible(root.right);
          
        
         
    }
}