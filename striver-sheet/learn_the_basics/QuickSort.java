import java.util.*;

class QuickSort{

    private static void QuickSort123(List<Integer> a, int lo, int hi){

        if(lo>=hi) return;

        int num = a.get(lo);
        int i=lo+1,j=hi;
        while(i<=j){
            if(a.get(j)>num) { j--; }
            else if(a.get(i)<=num) {i++;}
            else {
                int temp = a.get(i);
                a.set(i,a.get(j));
                a.set(j,temp);
            }
        }

        int temp = a.get(lo);
        a.set(lo,a.get(j));
        a.set(j,temp);

        QuickSort123(a,lo,j-1);
        QuickSort123(a,j+1,hi);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        System.out.println("Enter the element of array : ");
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt()); }

        System.out.println("Array before QuickSort : ");
        for(int i=0;i<n;i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println();

        QuickSort123(a,0,n-1);

        System.out.println("Array after QuickSort : ");
        for(int i=0;i<n;i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }

}