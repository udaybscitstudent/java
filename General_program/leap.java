package General_program;
import java.util.Scanner;

public class leap {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter year:");
        int y = obj.nextInt();
        if((y%4==0 && y%100!=0) || y%400==0){
            System.out.println(y+" is leap year");
        }
        else{
            System.out.println(y+" is not leap year");
        }
        obj.close();
    }
}
