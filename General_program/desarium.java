/*
Given a number n, find if it is a Disarium number. A number is called a Disarium number if the sum of
 its digits raised to the power of their respective positions is equal to the number itself.

Examples: 

Input: n = 89
Output: true
Explanation: 81 + 92 = 8 + 81 = 89, which is equal to n. Therefore, 89 is a Disarium Number, so output is true.

Input: n = 81
Output: false
Explanation: 81 + 12 = 8 + 1 = 9, which is not equal to n. Therefore, 81 is not a Disarium Number, so output is false
*/
package General_program;
import java.util.Scanner;
public class desarium {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        String n = obj.nextLine();
        int l = n.length();
        int num = Integer.parseInt(n);
        int num1 = num , sum = 0;
        while(num!=0){
            int d= num%10;
            sum = sum+(int)Math.pow(d,l);
            num = num/10;
            l--;
        }
        if(num1==sum){
            System.out.println(n+" is desarium number");
        }
        else{
            System.out.println(n+" is not desarium number");
        }
        obj.close();
    }
}
