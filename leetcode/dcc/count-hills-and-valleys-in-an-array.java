// https://leetcode.com/problems/count-hills-and-valleys-in-an-array/

class Solution {
    public int countHillValley(int[] a) {
        int ans=0, n = a.length;
        for(int i=0;i<n;){
            int left=-1, curr=a[i], right=-1;
            if(i>0){left=a[i-1];}
            while(i<n && curr==a[i]){ i++;}
            if(i<n){right = a[i];}
            if(left==-1 || right==-1) continue;
            if(left<curr && right<curr) ans++;
            if(left>curr && right>curr) ans++;
        }

        return ans;
    }
}