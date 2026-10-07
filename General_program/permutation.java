package General_program;
import java.util.Scanner;

public class permutation {

    int fact_of_n(int n){
        int i , f=1;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    int fact_of_r(int r){
        int i , f=1;
        for(i=1;i<=r;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of n and r");
        int n = obj.nextInt();
        int r = obj.nextInt();
        
        permutation p = new permutation();
        int per = (p.fact_of_n(n)/p.fact_of_r(n-r));

        System.out.println("permutation = "+per);
        obj.close();
    }
}
