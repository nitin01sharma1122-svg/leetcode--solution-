import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
    List<List<Integer>>array = new ArrayList<>();
      
      if(root == null){
        return array;
      }

    Queue<TreeNode>queue = new LinkedList<>();
    queue.offer(root);
    boolean  flag = true;

   while(!queue.isEmpty()){
     LinkedList<Integer>level = new LinkedList<>();

       int size = queue.size();

        for(int i=0; i<size; i++){
         TreeNode node = queue.poll();
       if(flag){
        
        level.addLast(node.val);
       }else{
    
        level.addFirst(node.val);
       }

     if(node.left != null){
        queue.offer(node.left);
     }

     if(node.right != null){
        queue.offer(node.right);
     }

        }

        flag = !flag;
     array.add(level);

 }
      return array;

    }
}