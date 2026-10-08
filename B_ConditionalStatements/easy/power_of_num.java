//write a program to enter any number and power after that print after calculate.
package B_ConditionalStatements.easy;

import java.util.Scanner;

public class power_of_num {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number and power");
        int n = obj.nextInt();
        int p = obj.nextInt();
        System.out.println("Power of number = "+(int)Math.pow(n, p));
        obj.close();
    }
}
