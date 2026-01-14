class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k == 0) return new int[code.length];
        int[] ans = new int[code.length];
        for(int i = 0;i<code.length;i++){
            int x = Math.abs(k);
            int cur = k > 0 ? i + 1 : i - 1;

            while(x > 0){
                ans[i] += code[(cur + code.length) % code.length];
                x--;
                cur = k > 0 ? cur + 1 : cur - 1;
            }
        }
        return ans;
    }
}
