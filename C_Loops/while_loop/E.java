//wrtie a progarm in java to enter any number and check that number is palandrome or not.

import java.util.Scanner;

class E{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any nummber");
        int n = obj.nextInt();
        int num = n;
        int rev =0;
        while(n!=0){
            int r = n%10;
            rev = rev*10+r;
            n=n/10;
        }
        if(num==rev){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not palindrome number");
        }
        obj.close();
    }
}