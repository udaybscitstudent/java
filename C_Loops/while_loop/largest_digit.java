//write a program to enter any number after that print largest digit of the number
import java.util.Scanner;
public class largest_digit {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int l=0;
        while(n!=0){
            int r = n%10;
            if(r>l){
                l=r;
            } 
            n=n/10;
        }
        System.out.println("largest digit = "+l);
        obj.close();
    }
}
