import java.util.*;

class OneToNRecursion {

    private static void print1ToN(int n){
        if(n<=0) return;
        print1ToN(n-1);
        System.out.println("the number is : " + n);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        print1ToN(n);
    }

}