/*Write a program to enter any number after that check the number is even or odd */

package B_ConditionalStatements.if_else;
import java.util.Scanner;
public class even_odd {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        if(n%2==0){
            System.out.println(n+" is even number");
        }
        else{
            System.out.println(n+" is odd number");
        }
        obj.close();
    }
}
