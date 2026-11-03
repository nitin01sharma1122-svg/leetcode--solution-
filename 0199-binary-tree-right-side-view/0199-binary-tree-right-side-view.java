class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        
    
    List<Integer>ans   = new ArrayList<>();
     Queue<TreeNode>queue = new LinkedList<>();
            if(root == null){
                return ans;
            }
           queue.offer(root);
        
        while(!queue.isEmpty()){
        
            int size = queue.size();
            
            
            for(int i=0; i<size; i++){
                
                 root  = queue.poll();
                
                if(i==size-1){
                    ans.add(root.val);
                }
            
            
              if(root.left != null){
                queue.offer(root.left);
            }
            
            if(root.right != null){
                queue.offer(root.right);
            }
            
            
            
            
        }
         
    
        }
    
    
    
        return ans;
        
    }
}

