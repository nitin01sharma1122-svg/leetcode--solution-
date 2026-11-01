
      class Solution {
    public int splitArray(int[] arr, int k){
  int low  = arr[0];
  int high  = arr[0];

  for(int  i = 0; i<arr.length; i++){
    low  = Math.max(low,arr[i]);
    high  += arr[i];
  }
         int ans  = 0;
  while(low<=high){
    int mid  = low+(high-low)/2;
     if(cansplit(arr,k,mid)){
        ans = mid;
        high  = mid-1;
     }else{
        low = mid+1;
     }

  }
     
    return ans;                                           
    
    }



    private boolean cansplit(int [] arr, int k ,int maxsum){

         int count = 1;
          int sum  = 0;
     for(int  i = 0; i<arr.length; i++){
        if(sum+arr[i]<=maxsum){
            sum += arr[i]; 
        }else{
            sum = arr[i];
            count++;
        }

        if(count>k){
            return false;
        }
     }

      return true;
    }
} 
    