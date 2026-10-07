import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner  obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = obj.nextInt();
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                System.out.println("Not Prime");
                obj.close();
                return;
            }
        }
        System.out.println("Prime");
        obj.close();
    }
    
}
