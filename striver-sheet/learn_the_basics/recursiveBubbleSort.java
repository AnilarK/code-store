import java.util.*;

class recursiveBubbleSort{



    private static void recursiveSort(List<Integer> a, int n){

        if(n==0) return;
        for(int i=0;i<n;i++){
            if(a.get(i) > a.get(i+1)){
                int temp = a.get(i);
                a.set(i,a.get(i+1));
                a.set(i+1,temp);
            }
        }
        recursiveSort(a,n-1);

    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt()); }

        System.out.println("Array before sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(a.get(i) +  " ");}
        System.out.println('\n');

        recursiveSort(a,n-1);

        System.out.println("Array after sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(a.get(i) +  " ");}

    }

}