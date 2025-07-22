class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n= arr.length , m=1000001;
        for(int i=0;i<n;i++){
            if(arr[i]<0) {arr[i]=0; } }
        for(int i=0;i<n;i++){
            int p = arr[i]%m;
            if(p>n || p==0) continue;
            arr[p-1]+=m; }
        for(int i=0;i<n;i++){
            if(arr[i]<m) return i+1;
        }
        return n+1;
    }
}