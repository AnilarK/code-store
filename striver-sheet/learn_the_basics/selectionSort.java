class Solution {
    void selectionSort(int[] a) {
        int n=a.length;
        for(int i=0;i<n;i++){

            int minIndex =i;
            for(int j=i;j<n;j++){
                if(a[j]<a[minIndex]){minIndex=j;}
            }

            int temp = a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;

        }

    }
}