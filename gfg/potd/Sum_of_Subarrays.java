class Solution {
    public int subarraySum(int[] arr) {
        int ans=0 , n=arr.length;
        for(int i=0;i<n;i++){
            ans+= arr[i]*(i+1)*(n-i);}
        return ans;
    }
}
