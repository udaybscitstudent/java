package General_program;
import java.util.Scanner;

public class HCF {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = (a<b?a:b);
        while(a%c!=0 || b%c!=0){
            c--;
        }
        System.out.println("HCF of "+a+" and "+b+" = "+c);
        obj.close();
    }
}
