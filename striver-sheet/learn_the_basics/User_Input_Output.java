import java.util.Scanner;


class User_Input_Output {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input of an byteNum");
        System.out.println("Input of an shortNum");
        System.out.println("Input of an intNum");
        System.out.println("Input of an floatNum");
        System.out.println("Input of an doubleNum");
        System.out.println("Input of an character");
        System.out.println("Input of an bool");
        System.out.println("Input of an String");
        System.out.println("Input of an String");

        byte byteNum = sc.nextByte();
        short shortNum = sc.nextShort();
        int intNum = sc.nextInt();
        float floatNum = sc.nextFloat();
        double doubleNum = sc.nextDouble();
        char character = sc.next().charAt(0);
        boolean bool = sc.nextBoolean();
        String string = sc.next();
        String string2 = sc.nextLine();

        System.out.println("Input of an byteNum " + byteNum);
        System.out.println("Input of an shortNum " + shortNum);
        System.out.println("Input of an intNum " + intNum);
        System.out.println("Input of an floatNum "  + floatNum);
        System.out.println("Input of an doubleNum "  + doubleNum);
        System.out.println("Input of an character "  + character);
        System.out.println("Input of an bool " + bool);
        System.out.println("Input of an String "+ string);
        System.out.println("Input of an String "+ string2);

    }

}