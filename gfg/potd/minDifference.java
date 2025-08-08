class Solution {
    public int minDifference(String[] arr) {
        // code here
        int ans=10000000, n=arr.length;
        int[] seconds = new int[n];
        for(int i=0;i<n;i++){
            int sec=0,x=1;
            for(int j=arr[i].length()-1;j>=0;j-=3){
                int num = (arr[i].charAt(j-1) -'0') *10;
                num+= (arr[i].charAt(j) -'0');
                sec+= num*x;
                x=x*60; }
            seconds[i]=sec;
        }
        
        Arrays.sort(seconds);
        for(int i=0;i<n;i++){
            ans=Math.min(ans,(86400 + seconds[(i+1)%n]-seconds[i])%(86400));
        }
        
        return ans;
    }
}