package C_Loops.for_loop;

import java.util.Scanner;

public class faboncii {
    public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the length of the series");
    int n = obj.nextInt();
    int a=0 , b=1, c=0;
    for(int i=0;i<n;i++){
        c=a+b;
        a=b;
        b=c;
        System.out.print(c+" ");
    }
    obj.close();
    }
}
