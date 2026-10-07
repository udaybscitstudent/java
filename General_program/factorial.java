import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial of "+n+" = "+f);
        obj.close();
    }
}
