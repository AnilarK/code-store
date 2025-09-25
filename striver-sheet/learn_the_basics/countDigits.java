class Solution {
    public int countDigits(int n) {
        // code here
        int ans=0;
        while(n!=0){
            ans++;
            n=n/10;
        }
        return ans;
    }
}
