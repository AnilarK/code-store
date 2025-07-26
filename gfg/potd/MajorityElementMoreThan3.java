class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n=arr.length;
        int ans1=-10000000,ans2=-100000000;
        int freq1=0,freq2=0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(freq1==0){
                ans1=arr[i];  freq1=1;}
            else if(arr[i]==ans1){freq1++;}
            else if(freq2 ==0){
                ans2=arr[i]; freq2=1; } 
            else if(ans2==arr[i]){freq2++;}
            else{freq1--; freq2--;} }
            
        freq1=0; freq2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ans1){freq1++;}
            else if(ans2==arr[i]){freq2++;} }
        
        if(freq1*3 > n) ans.add(ans1);
        if(freq2*3 > n) ans.add(ans2);
        Collections.sort(ans);
        return ans;
    }
}