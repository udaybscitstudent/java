/*write a program to take a number and print that number
 if the number is prime otherwise print the nearest greater prime number.
 */
import java.util.Scanner;
public class nearest_prime {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int i, f=0 , c=0;
        while(f!=1){
        // for(f=0;f<=100;f++){
            for(i=1;i<=n;i++){
                if(n%i==0){
                   c++;
                }
            }
            if(c==2){
                f=1;
                break;
            }else{
                n++;
            }
            c=0;
        
        }
        System.out.println("nearest prime number="+n);
        obj.close();
    }
}
