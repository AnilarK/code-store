// https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/

class Solution {
    public int maxSum(int[] a) {
        int ans=0,p=-10000;
        int[] x= new int[101];
        for(int i=0;i<a.length;i++){
            p=Math.max(p,a[i]);
            if( a[i]<0 ) continue;
            if(x[a[i]]==0) ans+=a[i];
            x[a[i]]=1;
        }
        if(ans==0) return p;
        return ans;
    }
}