import java.util.*;

class recursiveInsertionSort {


    private static void recurssiveInsertionSort(List<Integer> a,int n){
        if(n==0) return;
        recurssiveInsertionSort(a,n-1);

        for(int i=n-1;i>=0;i--){
            if(a.get(i) > a.get(i+1) ){
                int temp = a.get(i+1);
                a.set(i+1,a.get(i));
                a.set(i,temp);
            } else { break; }
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of Array : ");
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());}

        System.out.println("Array before recurssiveInsertion sorting");
        for(int i=0;i<n;i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.print("\n");

        recurssiveInsertionSort(a,n-1);

        System.out.println("Array after recurssiveInsertion sorting");
        for(int i=0;i<n;i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.print("\n");


    }

}
