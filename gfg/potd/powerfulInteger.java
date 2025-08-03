class Solution {
    public int powerfulInteger(int[][] a, int k) {
        // code here
        int n=a.length ;
        Map<Integer,Integer> m = new TreeMap<>();
        for(int i=0;i<n;i++){
            m.put(a[i][0], m.getOrDefault(a[i][0],0) + 1);
            m.put(a[i][1]+1, m.getOrDefault(a[i][1]+1,0) - 1);
        }
        int x=0,ans=-1;
        for( Map.Entry<Integer,Integer> it: m.entrySet() ){
            int p=0;
            if(x>=k){p=1;}
            x+=it.getValue();
            //  System.out.println(it.getKey() + " " + x );
            if(p==1){ans=it.getKey() - 1;}
            if(x>=k){ans=it.getKey();}
        }
        return ans;
    }
}