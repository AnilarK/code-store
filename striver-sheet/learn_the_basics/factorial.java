import java.util.*;

class factorial{

    private static int fact(int n){
        if(n<=0) return 1;
        return n*fact(n-1);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int n =  sc.nextInt();

        System.out.println("Factorial of the number is : " + fact(n) );

    }

}