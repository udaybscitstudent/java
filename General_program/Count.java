package General_program;
import java.util.Scanner;
public class Count {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        int ec=0, oc=0,d;
        while(n!=0){
            d = n%10;
             
            if(d%2==0){
                ec++;
            }
            else{
                oc++;
            }
            n=n/10;
        }
        System.out.println("count of even digit="+ec+" and odd digit="+oc);
        obj.close();
    }
}
