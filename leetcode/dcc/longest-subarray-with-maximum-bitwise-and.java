// https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/

class Solution {
    public int longestSubarray(int[] a) {
        int n = a.length , ans=0 , m=0;
        for(int i=0;i<n;){
            int p=a[i],x=0;
            while(i<n && p==a[i]){
                i++; x++;}
            if(p>m){
                m=p; ans=x;
            }else if(m==p){
                ans=Math.max(ans,x);
            }
        }
        
        return ans;
    }
}