class Solution {
    public ArrayList<ArrayList<Integer>> applyDiff2D(int[][] mat, int[][] opr) {
        int n=mat.length , m=mat[0].length;
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(0);}
            x.add(row);}
        for (int i = 0; i < opr.length; i++) {
            for (int j = opr[i][1]; j <= opr[i][3]; j++) {
                int oldVal = x.get(j).get(opr[i][2]);
                x.get(j).set(opr[i][2], oldVal + opr[i][0]);
        
                if (opr[i][4] + 1 < m) {
                    int subVal = x.get(j).get(opr[i][4] + 1);
                    x.get(j).set(opr[i][4] + 1, subVal - opr[i][0]);
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            int p = 0;
            for (int j = 0; j < m; j++) {
                p += x.get(i).get(j);
                x.get(i).set(j, p + mat[i][j]);
            }
        }
        return x;
    }
}