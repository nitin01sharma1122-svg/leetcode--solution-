import java.util.*;
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>result  = new ArrayList<>();
        List<Integer>ans  = new ArrayList<>();
        
       dfs(root,targetSum,ans,result);

        return result ;

    }


  public void dfs(TreeNode root, int targetSum,   List<Integer>ans, List<List<Integer>>result){


          if(root == null){
             return ;
          }
                   ans.add(root.val);
        
       if(root.left == null && root.right == null){
                if(targetSum == root.val){
                    result.add(new ArrayList<>(ans));
                    
                }
               

       }
            
        dfs(root.left,targetSum-root.val,ans,result);

        dfs(root.right,targetSum-root.val,ans,result);

           
        ans.remove(ans.size()-1);
        

            
    }
}