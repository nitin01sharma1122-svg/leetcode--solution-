
      import java.util.*;
class Solution {

    public boolean isHappy(int n) {
 HashSet<Integer> set =  new HashSet<>();
    
    while(!set.contains(n)){
        set.add(n);
        int sqrsum = 0;
        while(n!=0){
            int rem = n %10;
            sqrsum += rem*rem;
            n = n/10;
        }
        if(sqrsum == 1){
            return true ;
        }else{
            n = sqrsum;
        }
    }
        return false;

    }  
    }
