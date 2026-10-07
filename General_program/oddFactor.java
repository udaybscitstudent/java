package General_program;
import java.util.Scanner;
public class oddFactor {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int sum=0;
        System.out.println("odd factor of "+n);
        for(int i=1;i<=n;i++){
            if(n%i==0 && i%2==1){
                sum=sum+i;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nsum of oddFactor = "+sum);
        obj.close();
    }
}
