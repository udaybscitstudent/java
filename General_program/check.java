package General_program;
import java.util.Scanner;
public class check {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = obj.nextInt();
        int c = n%2;
        switch(c){
            case 0:
                System.out.println("Even");break;
            case 1:
                System.out.println("Odd");break;
        }
        obj.close();
    }
}
