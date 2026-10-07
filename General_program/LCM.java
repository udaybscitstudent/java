package General_program;
import java.util.Scanner;
public class LCM {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = (a>b?a:b);
        while(c%a!=0 || c%b!=0){
             c++;
        }
        System.out.println("LCM of two numbers is: " + c);
        obj.close();
    }
}
