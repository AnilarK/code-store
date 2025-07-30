class Solution {
    public static int balanceSums(int[][] mat) {
        // code here
        int n=mat.length , m=mat[0].length;
        int ans=0,s=0,x=0;
        for(int i=0;i<n;i++){
            int p=0;
            for(int j=0;j<m;j++){
                s+=mat[i][j];
                p+=mat[i][j];
                if(i>0){mat[i][j]+=mat[i-1][j];}
                if(i==n-1){x=Math.max(x,mat[i][j]);} }
            x=Math.max(x,p);
        }
        return x*n - s;
    }
}