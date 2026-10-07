package switch_case;
import java.util.Scanner;
public class B {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int result=0;
        System.out.println("Enter 1. for addition");
        System.out.println("Enter 2. for subtraction");
        System.out.println("Enter 3. for multiple");
        System.out.println("Enter 4. for Divide");
        System.out.println("Enter 5. for exit");
        System.out.println("Enter your choice");
        int ch = obj.nextInt();
        switch(ch){
            case 1:
                result=a+b;break;
            case 2:
                result=a-b;break;
            case 3:
                result=a*b;break;
            case 4:
                result=a/b;break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Enter valid choice");
                obj.close();
                return;
        }
        System.out.println("result="+result);
        obj.close();
    }    
}
