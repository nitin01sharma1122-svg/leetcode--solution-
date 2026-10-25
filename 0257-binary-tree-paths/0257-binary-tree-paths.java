class Solution {
    List<String> ans = new ArrayList<>();


    
    public List<String> binaryTreePaths(TreeNode root) {
            
  if(root == null){
    return ans ;
  }
     dfs(root,"");
     return ans ;
    }
    private void dfs (TreeNode root,  String path){
        path = path + root.val;
           if(root.left==null && root.right==null){
            ans.add(path);
            return ;
           }
           if(root.left != null){
              dfs(root.left,path + "->");

           }
           if(root.right != null){
            dfs(root.right,path + "->");
           }
    }
  }
        

        

    