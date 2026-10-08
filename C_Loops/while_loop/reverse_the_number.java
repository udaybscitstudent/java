//wrtie a progarm in java to enter any number and reverse it.
import java.util.Scanner;

class reverse_the_number{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any nummber");
        int n = obj.nextInt();
        int num = n;
        int rev =0;
        while(n!=0){
            int r = n%10;
            rev = rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse of "+num+" = "+rev);
        obj.close();
    }
}