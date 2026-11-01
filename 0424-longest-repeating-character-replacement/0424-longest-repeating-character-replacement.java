class Solution {
    public int characterReplacement(String s, int k) {
      int [] freq = new int [26];
      int n  = s.length();
      int maxcount = 0;
      int maxlength = 0;
      int left = 0;
      for(int right=0; right<n; right++){
        char ch  = s.charAt(right);
        freq[ch-'A']++;
        maxcount = Math.max(maxcount,freq[ch-'A']);
        while((right-left+1)-maxcount>k){
            freq[s.charAt(left)-'A']--;
            left++;
        }
        
        maxlength = Math.max(maxlength,right-left+1);
      }
      return maxlength;
    }
}