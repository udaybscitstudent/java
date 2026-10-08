//write a progarm in java to enter any number and print sum of all digits of entered number.
import java.util.Scanner;

public class A {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int sum =0 ;
        while(n!=0){
            int r = n%10;
            sum = sum+r;
            n=n/10;
        }
        System.out.println("Sum of all digits = "+sum);
        obj.close();
    }
}
