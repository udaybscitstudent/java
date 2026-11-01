package A_Basic_Programs.Easy_program;  //it is not compulsory

import java.util.Scanner;

public class swap {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = obj.nextInt();
        int b = obj.nextInt();

        // swapping without using third variable
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping a = "+a+ " b = "+b);
        obj.close();
    }

}
