// write a program to perform addition and subtraction of two number using polymorphism in java.
import java.util.Scanner;
public class add_sub {
    void add(int a, int b){
        System.out.println("Addition of two int numbers is: " + (a+b));
    }
    void add(int a , float b){
        System.out.println("Addition of int and float number="+(a+b));
    }

    void sub(int a , int b){
        System.out.println("\nSubtraction of two int number: = "+(a-b));
    }

    void sub(int a , float b){
        System.out.println("Subtraction of two int number: = "+(a-b));
    }

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = obj.nextInt();
        int b = obj.nextInt();
        float c = obj.nextFloat();

        add_sub as = new add_sub();
        as.add(a, b);
        as.add(a, c);
        as.sub(a, b);
        as.sub(a, c);

        obj.close();
    }
}
