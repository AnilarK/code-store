class Solution {
    public int maxFrequency(int[] a, int k) {
        long sum=0;
        Arrays.sort(a);
        int i=0, n = a.length;
        int ans=0;
        for(int j=0;j<n;j++){
            if(j>0){
                sum+=(long)(j-i)*((long)(a[j]-a[j-1])); }
            while(sum>k && i<j){
                sum-=(long)(a[j]-a[i]);
                i++;}
            ans=Math.max(ans,j-i+1);
        }

        return ans;
    }
}