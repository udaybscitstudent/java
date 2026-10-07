package General_program;
import java.util.Scanner;
public class amicable {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int sum1=0 , sum2=0;
        for(int i=1;i<=num1/2;i++){
            if(num1%i==0){
                sum1=sum1+i;
            }
        }
        for(int i=1;i<=num2/2;i++){
            if(num2%i==0){
                sum2=sum2+i;
            }
        }

        if(num1==sum2 && num1==sum2){
            System.out.println("The number is amicable");
        }
        else{
            System.out.println("Not amicable number");
        }
        obj.close();
    }
}
