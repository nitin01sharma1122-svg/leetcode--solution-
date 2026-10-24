
        class Solution {
 List<List<Integer>> ans  = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
          backtrack(0,nums,new ArrayList<>());
          return ans; 

    }
           

           

  private void backtrack(int index,int [] nums, List<Integer> path){
         
       if(index==nums.length){
            ans.add(new ArrayList<>(path));
            return;
           }



     path.add(nums[index]);

     backtrack(index+1,nums,path);
     path.remove(path.size()-1);

     backtrack(index+1,nums,path);
    }
}
    