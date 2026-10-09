//write a program to take a number and check that number is harshad or not
/*
harshard number: - whose number is divisible by sum of its digit is called harshad number.
ex:- 81, 24 etc.
*/

package General_program;
import java.util.Scanner;

public class harshad {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int sum=0;
        int num = n;
        while(n!=0){
            int d = n%10;
            sum = sum+d;
            n=n/10;
        }
        if(num%sum==0){
            System.out.println(num+" is a harshad number");
        }
        else{
            System.out.println(num+" is not a harshad number");
        }
        obj.close();
    }
}
