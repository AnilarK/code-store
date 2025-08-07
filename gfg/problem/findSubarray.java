// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        long sum=0 ;
        int n= arr.length;
        for(int i=0;i<n;){
            if(arr[i]<0){ i++; continue;}
            long curr_sum=0;
            ArrayList<Integer> temp= new ArrayList<>();
            
            while(i<n && arr[i]>=0){
                curr_sum+=arr[i]; 
                temp.add(arr[i]);
                i++; }
            
            if(curr_sum > sum){
                sum=curr_sum;
                ans=temp; } 
        }
        
        if(ans.size()==0){ans.add(-1);}
        return ans;
    }
}