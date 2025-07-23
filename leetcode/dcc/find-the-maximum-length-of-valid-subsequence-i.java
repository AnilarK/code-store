// https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-i/

class Solution {
    public int maximumLength(int[] a) {
        int n=a.length;
        int ans1=0,ans2=0,ans3=0;
        int p=a[0]%2;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){ans1++;}
            else if(a[i]%2==1){ans2++;}

            if(a[i]%2==p){
                ans3++;
                p=1-p;}
        }

        return Math.max(ans3,Math.max(ans2,ans1));
        
    }
}