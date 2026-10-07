//write a program in java to enter two number after that check twin prime number;
import java.util.Scanner;

public class G {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two number");
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        int i=2 , f1=0 , f2=0;
        while(i!=n1){
            if(n1%i==0){
                f1=1;
                break;
            }
            i++;
        }
        i=2;
        while(i!=n2){
            if(n2%i==0){
                f2=1;
            }
            i++;
        }

        if(f1==0 && f2==0 &&(n1-n2==2 || n2-n1==2)){
            System.out.println("Twin prime number");
        }
        else{
            System.out.println("Not twin prime number");
        }
        obj.close();
    }
}
