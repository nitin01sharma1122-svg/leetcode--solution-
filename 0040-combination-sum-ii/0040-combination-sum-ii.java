
        


        class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {


         List<List<Integer>>list = new ArrayList<>();
         List<Integer>ans  = new ArrayList<>();
          Arrays.sort(candidates);

         solve(0,candidates,target,list,ans);
         return list;



    }

     public  static void solve(int index, int[]candidates,int target, List<List<Integer>>list, List<Integer>ans){


            if(target==0){
                list.add(new ArrayList<>(ans));
                return;
            }
                for(int i = index; i<candidates.length; i++){       


               if(i>index && candidates[i]==candidates[i-1]){
                      continue;
               }        
               

               if(candidates[i]>target){
                break;
               }
              
        
            ans.add(candidates[i]);
            solve(i+1,candidates,target-candidates[i],list,ans);

            ans.remove(ans.size()-1);
          
                }       
        
    }
}
    
