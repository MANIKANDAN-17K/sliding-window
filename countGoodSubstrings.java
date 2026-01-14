class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        if(n<3) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int c = 0;
        for(int r = 0;r<n;r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            if(r - l + 1 == 3){
                if(map.size() == 3) c++;
                int f = map.get(s.charAt(l));
                if(f == 1){
                    map.remove(s.charAt(l));
                }else{
                    map.put(s.charAt(l),f-1);
                }
                l++;
            }
        }
        return c;
    }
}
