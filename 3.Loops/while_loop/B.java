//write a program in java to input any number after that count of digits.
import java.util.Scanner;

public class B {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int c =0;
        while(n!=0){
            c = c+1;
            n = n/10;
        }
        System.out.println("Count of digit="+c);
        obj.close();
    }
}
