//write a program to enter initial and final and print all prime number between initial to final.

package C_Loops.for_loop; 
import java.util.Scanner;

public class prime_in_range {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter initial and last number");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int f=0;
        System.out.println("prime number between "+a+ " to "+b);
        for(int i=a;i <= b;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.print(i+" ");
            }
            f=0;
        }
        obj.close();
    }
}
