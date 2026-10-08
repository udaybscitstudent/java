//write a program in java to input any number and check the number is composite or not
import java.util.Scanner;

public class check_composite {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        if(n==0||n==1){
            System.out.println("Neither compositer nor primer number");
            obj.close();
            return;
        }
        int i=2;
        while (i!=n) {
            if(n%i==0){
                System.out.println("composite number");
                obj.close();
                return;
            }
            i++;
        }
        System.out.println("prime number");
        obj.close();
    }
}
