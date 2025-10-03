class Solution {
    public int getSecondLargest(int[] a) {
        // code here
        int largest = -1, secondLargest = -1;
        int n = a.length;

        for(int i=0;i<n;i++){
            if(a[i]>largest){
                secondLargest = largest ;
                largest = a[i];
            }
            if (a[i] > secondLargest  && a[i]!=largest){
                secondLargest = a[i];
            }
        }

        return secondLargest;
    }
}