package B_ConditionalStatements.easy;

import java.util.Scanner;

public class check_p_n_z {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = obj.nextInt();
        if(n>0){
            System.out.println(n+" is positive");
        }
        else if(n<0){
            System.out.println(n+" is negative");
        }
        else{
            System.out.println(n+"  is zero");
        }
        obj.close();
    }
    
}
