import java.util.*;

class if_else_statement{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of student");
        Integer marks;
        while(true) {
            marks = sc.nextInt();

            if (marks == null || marks > 100 || marks < 0) {
                System.out.println("Invalid marks , pls input in the range of 0 to 100");
            } else{
                break;
            }

        }

        if(marks >= 90){
            System.out.println("Grade A");
        } else if(marks >= 70){
            System.out.println("Grade B");
        } else if(marks >= 50){
            System.out.println("Grade C");
        } else if(marks >= 35){
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

    }
}