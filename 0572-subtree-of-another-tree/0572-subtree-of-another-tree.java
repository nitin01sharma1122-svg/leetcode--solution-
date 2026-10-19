class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        

             if(root == null){
                  return false;
             }

             if(dfs(root,subRoot)){
                  return true;
             }
        
            return   isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot);
           
    }

     public boolean dfs(TreeNode root, TreeNode subRoot){
                  

                 
                if(root == null && subRoot == null){
                      return true;
                }
             
                 if(root == null || subRoot == null){


                       return false;
                }
    


            if(root.val != subRoot.val){
                  return false;
       }  
            boolean left  = dfs(root.left , subRoot.left);

            boolean right  = dfs(root.right, subRoot.right);

               return left && right;
        
    }
}