class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here
        int n = s.length(),sum=0;
        int[] x = new int[26];
        int[] y = new int[26];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            char p = s.charAt(i);
            int j=p-'a';
            if(x[j]!=0){
                y[j]=Math.max(y[j],sum - x[j]);
            }
            sum += p;
            if(x[j]==0){x[j]=sum;}
        }
        for(int i=0;i<26;i++){
            if(y[i]==0) continue;
            ans.add(y[i]); }
        
        return ans;
        
    }
}
