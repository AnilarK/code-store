class Solution {
    // Please change the array in-place
    public void insertionSort(int a[]) {

        int n = a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j-1]>a[j]){
                int temp = a[j];
                a[j]=a[j-1];
                a[j-1] = temp;
                j--;
            }

        }

    }
}