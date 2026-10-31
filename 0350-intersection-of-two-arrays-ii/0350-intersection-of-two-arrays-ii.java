import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         
    int n1 = nums1.length;
    int  n2 = nums2.length;

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i<n1; i++){
        map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
    }
    ArrayList<Integer> list = new ArrayList<>();
       for(int j=0; j<n2; j++){
        if(map.containsKey(nums2[j]) && map.get(nums2[j])>0){
            list.add(nums2[j]);
            map.put(nums2[j],map.get(nums2[j])-1);
        }
       }
       int [] result = new int [list.size()];
       for(int i=0; i<list.size(); i++){
        result[i] = list.get(i);
       }
       return result;
    }
}