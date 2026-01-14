class Solution {
    public int divisorSubstrings(int num, int k) {
       String str = String.valueOf(num);
       int kbeauty = 0;
       int l = 0;
       for(int r = k -1;r<str.length();r++){
        if(r - l +1 > k){
            l++;
        }
        String temp= str.substring(l,r+1);
        int subnum = Integer.valueOf(temp);
        if(subnum == 0) continue;
        if(num % subnum == 0) kbeauty++;
       }
       return kbeauty;
    }
}
