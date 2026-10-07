//write a program in java to take month number of the year and display name of the month.
import java.util.Scanner;
public class A {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter month number");
        int m = obj.nextInt();
        String s=null;
        switch(m){
            case 1:
                s="january";break;
            case 2:
                s="february";break;
            case 3:
                s="march";break;
            case 4:
                s="April";break;
            case 5:
                s="May";break;
            case 6:
                s="June";break;
            case 7:
                s="July";break;
            case 8:
                s="August";break;
            case 9:
                s="September";break;
            case 10:
                s="October";break;
            case 11:
                s="November";break;
            case 12:
                s="December";break;
            default:
                 s="Enter valid month number"; 
        }
        System.out.println(s);
        obj.close();

    }
}
