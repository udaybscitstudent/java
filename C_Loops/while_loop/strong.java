//write a program to take number and check the number is strong or not.
/*strong number:- those number , the sum of factorial of its digit is equal to that number is called strong number. */

import java.util.Scanner;
public class strong {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int sum=0;
        int num =n;
        while(n!=0){
            int r = n%10;
            sum = sum+fact(r);
            n=n/10;
        }
        if(num==sum){
            System.out.println(num+" is strong number");
        }
        else{
            System.out.println(num+" is not strong number");
        }
        obj.close();
    }
    public static int fact(int n){
        int f=1;
        for(int i = 1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
}
