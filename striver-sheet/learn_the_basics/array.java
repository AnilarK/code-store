import java.util.*;

class array {

    public static void main ( String args[] ) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the size of array : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Output of the array using for loop");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("Output of the array using while loop");
        int i=0;
        while(i<n){
            System.out.print(a[i] + " ");
            i++;
        }


    }

}