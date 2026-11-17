class Solution {
    static class Pair{
        TreeNode node;
        int idx;

        Pair(TreeNode node, int idx){
            this.node  = node;
            this.idx   = idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair>queue  = new LinkedList<>();
        
        

         int maxcount = 0;
               if(root == null){
                   return  0;
               }
        queue.offer(new Pair(root,0));

          while(!queue.isEmpty()){
             
             int size  = queue.size();
             int firstIndex = 0;
             int lastIndex  = 0;
             for(int i= 0; i<size; i++){
               
                 
            Pair curr = queue.poll();
                  if(i == 0){
                      firstIndex = curr.idx;
                  }
                     if(i==size-1){
                    lastIndex = curr.idx;
                }
            if(curr.node.left != null){
                queue.offer(new Pair(curr.node.left,curr.idx*2+1));
            }

            if(curr.node.right != null){
                queue.offer(new Pair(curr.node.right,curr.idx*2+2));
            }

           
          } 
             int  count  = lastIndex - firstIndex+1;
            maxcount  = Math.max(maxcount,count);
          }

          return maxcount;
   
  
           




    }
}