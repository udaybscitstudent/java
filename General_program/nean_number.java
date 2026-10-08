//write a program to take a number and check the number is neon no or not.
package General_program;
import java.util.Scanner;
public class nean_number {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int s=0;
        int num=n;
        for(;n!=0;){
            int r = n%10;
            s=s+r;
            n=n/10;
        }
        s=s*s;
        if(num==s){
            System.out.println(num+" is neon number");
        }
        else{
            System.out.println(num+" is not neon number");
        }
        obj.close();
    }
}
