// https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/

class Solution {
    public List<String> removeSubfolders(String[] a) {
        Arrays.sort(a);
        List<String> ans = new ArrayList<>();
        Set<String> s = new HashSet<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            boolean flag = false;
            int m=a[i].length();
            for(int j=0;j<m;j++){
                if(a[i].charAt(j)=='/'){
                    String curr = a[i].substring(0,j);
                    if(s.contains(curr)){
                        flag=true;
                        break; }
                }
            }

            if(!flag){
                s.add(a[i]);
                ans.add(a[i]);}
        }

        return ans;
    }
}