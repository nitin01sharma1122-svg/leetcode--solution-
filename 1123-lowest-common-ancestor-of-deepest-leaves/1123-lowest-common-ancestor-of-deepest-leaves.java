class Solution {

    static class Pair{
        TreeNode node  ;
        int depth;

        Pair(TreeNode node, int depth){
            this.node  = node;
            this.depth = depth;
        }
    }
  public TreeNode lcaDeepestLeaves(TreeNode root) {

            Pair ans  = solve(root);

                  return ans.node; 

  }
    
    private  Pair solve(TreeNode root){

            if(root == null){
                return new Pair(null,0);
            }
     
       

             Pair left   =  solve(root.left);
             Pair  right =  solve(root.right);



               if(left.depth>right.depth){
                   return new Pair(left.node,left.depth+1);
               }
            if(left.depth<right.depth){

                return new Pair(right.node,right.depth+1);

            }
           
                  return new Pair(root,left.depth+1);

      


         
    }
}