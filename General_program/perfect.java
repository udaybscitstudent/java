package General_program;
import java.util.Scanner;
public class perfect {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = obj.nextInt();
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not perfect number");
        }
        obj.close();
    }
}
