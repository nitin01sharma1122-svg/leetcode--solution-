class Solution {
      HashMap<Integer,Integer>map = new HashMap<>();
       int preorderidx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     for(int i = 0; i<inorder.length; i++){
        map.put(inorder[i],i);
     }
           preorderidx = 0;
      return build(preorder,inorder,0,inorder.length-1);
    }
     public TreeNode  build(int [] preorder,int [] inorder,int left, int right){
              
         
               if(left>right){
                 return null;
               }
        TreeNode root  = new TreeNode(preorder[preorderidx++]);

        int inorderidx = map.get(root.val);


        root.left  = build(preorder,inorder,left,inorderidx-1);
        root.right = build(preorder,inorder,inorderidx+1,right);

      
        
      return root;
    }
}