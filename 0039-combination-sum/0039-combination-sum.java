class Solution {


    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(0, candidates, target, new ArrayList<>());

        return ans;
    }

    private void backtrack(int index, int[] candidates,
                           int target, List<Integer> path) {

        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        path.add(candidates[index]);

        backtrack(index, candidates,
                  target - candidates[index], path);

        path.remove(path.size() - 1);

        backtrack(index + 1, candidates, target, path);
    }
}
    
