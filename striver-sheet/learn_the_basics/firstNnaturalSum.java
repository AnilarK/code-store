import java.util.*;

class firstNnaturalSum {

    private static int sum1ToN(int n){
        if(n<=0) return 0;
        return n + sum1ToN(n-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println( "Sum of first N natural number : " + sum1ToN(n) );
    }

}