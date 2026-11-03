class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
   List<Double>ans = new ArrayList<>();
   Queue<TreeNode>queue = new LinkedList<>();
     
    
          if(root == null){
             return ans;
          }       

          queue.offer(root);
          while(!queue.isEmpty()){
            int size  = queue.size();
            double sum  = 0;
            for(int i= 0; i<size; i++){
            
             root  = queue.poll();

                 sum  += root.val;

             if(root.left != null){
                queue.offer(root.left);
             }

             if(root.right != null){
                queue.offer(root.right);
             }
                 
            }

          
             double average  = sum/size;     

             ans.add(average);
          }


            return ans;
           





    }
}