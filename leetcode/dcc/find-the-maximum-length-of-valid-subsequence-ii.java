// https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-ii/

class Solution {
    public int maximumLength(int[] a, int k) {
        int n= a.length , ans=1;
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        x.add( new ArrayList<>(Collections.nCopies(k,1)) );
        for(int i=1;i<n;i++){
            x.add( new ArrayList<>(Collections.nCopies(k,0)) ); }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int p = (a[i]+a[j])%k;
                if(x.get(j).get(p) == 0){x.get(j).set(p,1);}
                if( x.get(i).get(p) < x.get(j).get(p) + 1){
                   x.get(i).set(p, x.get(j).get(p) + 1);
                }
                ans=Math.max(ans, x.get(i).get(p));
            }
        }

        return ans;
    }
}