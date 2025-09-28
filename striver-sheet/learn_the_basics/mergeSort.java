class Solution {

    void merge(int a[] ,int l,int mid, int r){
        int[] x = new int[r-l+1];
        int i=l,j=mid+1,k=0;
        while(i<=mid || j<=r){
            if(i>mid){ x[k]=a[j]; j++; }
            else  if(j>r){ x[k]=a[i]; i++; }
            else if(a[i]<a[j]){x[k]=a[i]; i++; }
            else{x[k]=a[j]; j++; }
            k++;
        }
        for(i=l;i<=r;i++){
            a[i]=x[i-l];
        }

    }

    void mergeSort(int a[], int l, int r) {
        if(l==r) return;
        int mid = (l+r)/2;
        mergeSort(a,l,mid);
        mergeSort(a,mid+1,r);
        merge(a,l,mid,r);
    }
}