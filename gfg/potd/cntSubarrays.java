class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        // code here
        int n=arr.length,ans=0,sum=0;
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(sum,1);
        for(int i=0;i<n;i++) {
            sum+=arr[i];
            ans += m.getOrDefault(sum - k, 0);
            m.put(sum, m.getOrDefault(sum, 0) + 1);}
        return ans;
    }
}