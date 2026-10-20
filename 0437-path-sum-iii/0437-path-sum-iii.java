class Solution {
    public int pathSum(TreeNode root, int targetSum) {

          if(root== null){
              return 0;
          }
             
        

        return  dfs(root,(long)targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
      
    }
     public int dfs(TreeNode root, long targetSum){
                int count  = 0;
 

                   if(root == null){
                    return 0;
                   }

          if(root.val == targetSum){
                count++;
          }
      


    int left     =    dfs(root.left,targetSum-root.val);
    int  right   =     dfs(root.right,targetSum-root.val);


              return   count+left+right;




    }
}