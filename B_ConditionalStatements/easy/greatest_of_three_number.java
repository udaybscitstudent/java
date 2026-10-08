package B_ConditionalStatements.easy;
import java.util.Scanner;

/**
 * greatest_of_three_number
 */
public class greatest_of_three_number {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter three number");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greater number in all three numbers");
        }
        else{
            if(b>c){
                System.out.println(b+" is greater number in all three numbers");
            }
            else{
                System.out.println(c+" is greater number in all three numbers");
            }
        }
        obj.close();
    }
}