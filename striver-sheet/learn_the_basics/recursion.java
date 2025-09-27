import java.util.*;

class recursion {

    private static void printN(String name, int n){
        if(n==0) return;

        System.out.println("the String is : " + name);
        printN(name,n-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Enter any string");
        String name = sc.next();

        printN(name,n);
    }

}