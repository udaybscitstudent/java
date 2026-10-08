package General_program;
import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter binary number:");
        int i=0  , b = obj.nextInt();
        double d=0;
        while(b!=0){
            int r = b%10;
            d = d+r* Math.pow(2,i);
            b=b/10;
            i++;
        }
        System.out.println("decimal number="+(int)d);
    }
}
