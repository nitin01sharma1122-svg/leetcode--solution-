class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
    
    return  dfs(root,0,targetSum);

    }
  public boolean   dfs(TreeNode root , int currsum ,int targetSum){

           

            if(root == null){
               return false;
            }     
             
             

             currsum += root.val;

             if(root.left == null &&  root.right == null){
                return currsum == targetSum;
             }

             boolean left  = dfs(root.left,currsum,targetSum);
              boolean right = dfs(root.right,currsum,targetSum);

            return   left || right;


  
    }
}