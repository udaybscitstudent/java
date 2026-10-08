//write a program to enter any number after that print samllest digit of the number
import java.util.Scanner;
public class smallest_digit {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int s=9;
        while(n!=0){
            int r = n%10;
            if(r<s){
                s=r;
            } 
            n=n/10;
        }
        System.out.println("samllest digit = "+s);
        obj.close();
    }
}
