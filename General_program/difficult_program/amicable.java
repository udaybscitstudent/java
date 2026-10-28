package General_program.difficult_program;

import java.util.Scanner;
public class amicable {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two number");
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        int fs=0 , ss=0, i;
        // for first number
        for(i=1;i<=n1/2;i++){
            if(n1%i==0){
                fs=fs+i;
            }
        }
        // for second number
        for(i=1;i<=n2/2;i++){
            if(n2%i==0){
                ss=ss+i;
            }
        }

        if(n1 == ss && n2==fs){
            System.out.println("Your entered pair numbers are amicable number");
        }
        else{
            System.out.println("Your entered pair numbers are not amicable number");
        }

        obj.close();

    }
}
