// https://leetcode.com/problems/maximum-erasure-value/

class Solution {
    public int maximumUniqueSubarray(int[] a) {
        int n = a.length , ans=0,x=0 ,i=0 ,s=0;
        int[] m = new int[10001];
        for(int j=0;j<n;j++){
            if(m[a[j]]==0){s++;}
            m[a[j]]++;
            x+=a[j];
            while( s < (j-i+1) ){
                x-=a[i];
                if(m[a[i]]==1){s--;}
                m[a[i]]--; i++;}
            ans=Math.max(ans,x);  }   
        return ans;
    }
}