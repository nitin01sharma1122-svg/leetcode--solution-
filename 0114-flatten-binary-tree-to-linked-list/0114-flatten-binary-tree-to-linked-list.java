class Solution {
    public void flatten(TreeNode root) {
     TreeNode curr = root;
     while(curr != null){
        if(curr.left != null){
        TreeNode temp = curr.right;
        curr.right = curr.left;
        curr.left = null;
        TreeNode  rightmost = Rightmost(curr.right);
               rightmost.right = temp;
     }

       curr = curr.right;
     } 
          
        
          }
        public  TreeNode Rightmost(TreeNode root){
           while(root.right!= null){
            root  = root.right;
           } 

           return root;
       


    }
}