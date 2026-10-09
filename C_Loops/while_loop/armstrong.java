//write a program to enter any after that check tthe number is armstrong or not.

import java.util.Scanner;

public class armstrong{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        String n = obj.nextLine();
        int l = n.length();
        int num = Integer.parseInt(n);
        int num1 = num , sum=0;

        while(num!=0){
            int r = num%10;
            sum = sum+(int)Math.pow(r, l);
            num = num/10;
        }

        if(num1 == sum){
            System.out.println(num1+" is armstrong number");
        }
        else{
            System.out.println(num1+" is not armstrong number");
        }
        obj.close();
    }
}