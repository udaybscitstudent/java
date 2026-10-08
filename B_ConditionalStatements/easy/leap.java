package B_ConditionalStatements.easy;
import  java.util.Scanner;
public class leap {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any year:");
        int year = obj.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
        obj.close();
    }
}
