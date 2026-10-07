//write a progam in java to print sum of even and odd digits.
import java.util.Scanner;

public class C {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int es=0 , os=0;
        while(n!=0){
            int r = n%10;
            if(r%2==0){
                es = es+r;
            }
            else{
                os = os+r;
            }
            n = n/10;
        }
        System.out.println("Sum of even and odd digits = "+ es + " and "+os);
        obj.close();
    }
}
