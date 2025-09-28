class Solution {
    public void bubbleSort(int[] a) {
        // code here
        int n = a.length;
        for(int i=n-2;i>=0;i--){

            for(int j=0;j<=i;j++){
                if(a[j+1]<a[j]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }

        }


    }
}
