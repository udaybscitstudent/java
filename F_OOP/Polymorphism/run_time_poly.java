/*
program:-  write a program to compute interest amount of bank SBI - 4.5% ,CB - 4.0% , PNB - 4.7% using run time polymorphism.
*/
/**
 * run_time_poly
*/
import java.util.Scanner;
public class run_time_poly {

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter amount:");
        double amount = obj.nextDouble();
         bank z;

        z = new SBI(amount);
        z.bank_interest();

        z = new CB(amount);
        z.bank_interest();

        z = new PNB(amount);
        z.bank_interest();

        
        obj.close();
    }

}

class bank{
    double amount; 
    bank(double amount){
    this.amount = amount;
    }
    void bank_interest(){
        System.out.println("Bank Interest:");
    }
}

class SBI extends bank{
    SBI(double amount){
        super(amount);
    }
    void bank_interest(){
        double interest = (amount * 4.5)/100;
        System.out.println("Interest of SBI = "+interest);
    }
}

class CB extends bank{
    CB(double amount){
        super(amount);
    }
    
    void bank_interest(){
        double interest = (amount * 4.0)/100;
        System.out.println("Interest of CB="+interest);
    }

}

class PNB extends bank{
    PNB(double amount){
        super(amount);
    }
    
    void bank_interest(){
        double interest = (amount * 4.7)/100;
        System.out.println("Interest of PNB="+interest);
    }

}