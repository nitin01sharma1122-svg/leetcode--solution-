class Solution {
     HashMap<Integer,Integer>map;
       int postorderidx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      map =   new HashMap<>();
      for(int i=0; i<inorder.length; i++){
        map.put(inorder[i],i);
      }

       postorderidx = postorder.length-1;

      return build(inorder,postorder,0,inorder.length-1);
    }
   public TreeNode build(int[]inorder,int[]postorder,int left, int right){
     
      if(left>right){
         return null;
      }

      TreeNode root  = new TreeNode(postorder[postorderidx--]);

        int inorderidx = map.get(root.val);

      root.right  = build(inorder,postorder,inorderidx+1,right);
      root.left   = build(inorder,postorder,left,inorderidx-1);
          return root;
   
          }
}