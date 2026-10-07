package General_program;
import java.util.Scanner;
public class allFactor {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        System.out.println("All factor of "+n);
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        obj.close();
    }
}
