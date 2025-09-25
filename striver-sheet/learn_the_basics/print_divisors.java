class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer>res = new ArrayList<>();

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                res.add(i);
                if(i*i!=n){
                    res.add(n/i);
                }
            }
        }
        Collections.sort(res);

        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i) + " ");
        }

    }
}
