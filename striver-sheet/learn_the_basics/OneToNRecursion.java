import java.util.*;

class OneToNRecursion {

    private static void print1ToN(int n){
        if(n<=0) return;
        print1ToN(n-1);
        System.out.println("the number is : " + n);
    }

    private static void printNTo1(int n){
        if(n<=0) return;
        System.out.println("the number is : " + n);
        printNTo1(n-1);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Output 1 To N : ");
        print1ToN(n);

        System.out.println("Output N To 1 : ");
        printNTo1(n);
    }

}