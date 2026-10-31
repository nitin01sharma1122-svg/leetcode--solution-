class Solution {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int n = s.length();
        int left = 0;
        int right = n-1;
        while(left<right){
       while(left<right && !isvowel(arr[left])){
           left++;
        } 
        while(left<right && !isvowel(arr[right])){
            right--;
        }
        char temp = arr[right];
        arr[right]= arr[left];
        arr[left]= temp;
        

        left ++;
        right--;

    }
    return new String(arr);
}
private boolean isvowel(char ch){
    return "aeiouAEIOU".indexOf(ch) != -1;
}

}