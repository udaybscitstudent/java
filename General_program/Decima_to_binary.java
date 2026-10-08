package General_program;
import java.util.Scanner;
class Decimal_to_binary{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any decimal number");
        int n = obj.nextInt(); 
        int arr[]=new int[20];
        int r, i=0;
        while(n!=0){
            r=n%2;
            arr[i++]=r;
            n=n/2;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        obj.close();
    }
}