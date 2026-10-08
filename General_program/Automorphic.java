//write a program to take a number and check the number is automorphic number or not.
/* Automorphic number: - An automorphic number is a number whose square ends with the same digits 
as the number itself. A number n is called automorphic.
ex:- 5=25 ends with the same digit
     6=36 here also ends with the same digit   
    25=625 this also ends with the same number.
*/
package General_program;
import java.util.Scanner;
public class Automorphic {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        String n = obj.nextLine();               
        int len = n.length();                    
        int num = Integer.parseInt(n);           
        int sn = num*num;                        
        int ld = sn%(int)Math.pow(10,len);     
        if(num==ld){
            System.out.println(n+" is an Automorphic number");
        }
        else{
            System.out.println(n+" is not an Automorphic number");
        }
        obj.close(); 
    }
}
