class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
    ArrayList<Integer>ans  = new ArrayList<>();
    
    dfs(root,ans);
    
    return ans;
    
    
    }
    
    
    
    public static void dfs(TreeNode root , List<Integer>ans){
        
        
         if(root== null){
             return;
         }
    
    
    
    
      ans.add(root.val);
      
      dfs(root.left,ans);
      
      dfs(root.right,ans);
      
       
    }
}