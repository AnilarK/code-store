class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        int n=arr.length, ans=0 ,x=0;
        TreeMap<Integer,Integer> m = new TreeMap<>();
        m.put(0,-1);
        for(int i=0;i<n;i++){
            if(arr[i]>k){x++;}
            else{x--;}
            
            Integer j = m.lowerKey(x);
            if(j!=null){
                ans=Math.max(ans,i-m.get(j)); }
            if(m.firstKey() > x){
                m.put(x,i); }
        }
        
        return ans;
    }
}