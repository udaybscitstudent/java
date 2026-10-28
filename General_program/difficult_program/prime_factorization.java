package General_program.difficult_program;

import java.util.Scanner;
public class prime_factorization {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n , i;
        System.out.println("Enter any number:");
        n = obj.nextInt();
        if(n<2){
            System.out.println("Prime Factorization is not possible");
            obj.close();
            return;
        }
        System.out.println("Prime factorization");
        for(i=2;i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        obj.close();
    }
}
